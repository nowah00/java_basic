package java_advanced.day23.practice.multiserverecho;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class MultiEchoServer {
    //서버가 클라이언트 접속을 받는 포트 번호(5000번)를 상수로 정의한 코드
    private static final int PORT = 5000;

    //클라이언트별 통신 처리를 위해 유동적으로 스레드를 관리하는 스레드풀을 만든 코드
    // -> ExecutorService: 스레드풀을 관리하는 인터페이스
    // -> Executors.newCachedThreadPool(): 팔요할 떄 스레드를 만듥, 재사용 가능한 스레드가 있으면 재활용하는 풀
    private static final ExecutorService POOL = Executors.newCachedThreadPool();

    //여러 클라이언트가 동시에 접속해도 충돌 없이 순차적인 고유 번호를 주기 위해 필요한 변수
    // -> AtomicInteger → 멀티스레드 환경에서 안전하게 정수를 증가/감소시킬 수 있는 클래스
    // -> new AtomicInteger(1) → 초기값을 1로 설정
    private static final AtomicInteger CLIENT_SEQ = new AtomicInteger(1);

    //--------------------------------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        //서버가 어느 포트에서 실행 중인지 콘솔에 알리기 위한 출력문
        System.out.println("[Server] Starting on port " + PORT);

        //Ctrl+C 등으로 서버가 종료될 때, 안내 메시지를 출력하고 스레드풀을 안전하게 정리하기 위한 코드
        // -> Runtime.getRuntime() → 현재 실행 중인 JVM(Runtime 환경) 객체 가져오기
        // -> addShutdownHook(Thread) → JVM이 종료되기 직전에 실행할 스레드 등록
        // -> System.out.println(...) → 서버가 종료된다는 메시지를 콘솔에 출력
        // -> POOL.shutdownNow() → 실행 중인 스레드를 모두 즉시 중단하고 스레드풀 정리
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("\n[Server] Shutting down...");
            POOL.shutdownNow();
        }));


        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            while (true) {

                Socket socket = serverSocket.accept();

                int id = CLIENT_SEQ.getAndIncrement();
                System.out.println("[Server] Client#" + id + " connected from " + socket.getRemoteSocketAddress());

                POOL.submit(new ClientHandler(socket, id));
            }
        } catch (IOException e) {
            System.err.println("[Server] Error: " + e.getMessage());
        }
    }
//--------------------------------------------------------------------------------------------------------------------------------------------
    // 개별 클라이언트-서버 간 채팅 메시지 송수신을 스레드 단위에서 수행됨
    private static class ClientHandler implements Runnable {
        private final Socket socket;
        private final int clientId;

        // 서버와 연결된 특정 클라이언트와의 메시지 송수신 작업을 처리
        // 한 스레드당 1개의 서버 소켓을 사용하여 클라이언트의 요청을 처리
        ClientHandler(Socket socket, int clientId) {
            this.socket = socket;
            this.clientId = clientId;   // 클라이언트에 관한 고유번호
        }
    //========================================================================================================================================
        @Override
        public void run() {
            try (
                    // 클라이언트 측의 채팅 메시지를 수신하기 위한 입력 스트림
                    BufferedReader in = new BufferedReader(
                            new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
                    // 클라이언트로부터 수신한 채팅 메시지를 콘솔창에 출력하는 스트림
                    PrintWriter out = new PrintWriter(
                            new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8), true)
            ) {
                out.println("Welcome! You are Client#" + clientId + ". Type 'exit' to quit.");
                String line;
                while ((line = in.readLine()) != null) {
                    System.out.println("[Server] From Client#" + clientId + ": " + line);
                    if ("exit".equalsIgnoreCase(line.trim())) {
                        out.println("Bye Client#" + clientId);
                        break;
                    }
                    // 받은 메시지를 그대로 돌려주는 에코
                    out.println("Echo to #" + clientId + ": " + line);
                }
            } catch (IOException e) {
                System.err.println("[Server] Client#" + clientId + " I/O error: " + e.getMessage());
            } finally {
                try { socket.close(); } catch (IOException ignored) {}
                System.out.println("[Server] Client#" + clientId + " disconnected.");
            }
        }
    }
//--------------------------------------------------------------------------------------------------------------------------------------------
}
