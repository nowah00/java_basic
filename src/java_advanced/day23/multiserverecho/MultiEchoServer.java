package java_advanced.day23.multiserverecho;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class MultiEchoServer {

    // 서버가 바인딩할 포트
    private static final int PORT = 50000;

    // 클라이언트 처리를 위한 스레드 풀(요청 수에 따라 스레드 생성/재사용)
    private static final ExecutorService POOL = Executors.newCachedThreadPool();

    // 접속 클라이언트에게 부여할 고유 번호(원자적 증가)
    private static final AtomicInteger CLIENT_SEQ = new AtomicInteger(1);

    public static void main(String[] args) {

        // 서버 시작 로그
        System.out.println("[Server] Starting on port " + PORT);

        // JVM 종료 시(CTRL+C 등) 스레드 풀 정리용 훅
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("\n[Server] Shutting down...");
            POOL.shutdownNow();
        }));

        // 서버 소켓 생성 및 포트 바인딩(try-with-resources로 안전 종료)
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {

            // 메인 accept 루프: 클라이언트 접속을 계속 대기/수락
            while (true) {
                // 블로킹: 새 클라이언트 소켓 하나 수락
                Socket socket = serverSocket.accept();

                // 클라이언트 고유 ID 발급 및 접속 로그
                int id = CLIENT_SEQ.getAndIncrement();
                System.out.println("[Server] Client#" + id + " connected from " + socket.getRemoteSocketAddress());

                // 클라이언트별 처리 작업을 스레드 풀에 위임
                POOL.submit(new ClientHandler(socket, id));
            }
        } catch (IOException e) {
            // 서버 소켓 레벨 예외 처리
            System.err.println("[Server] Error: " + e.getMessage());
        }
    }

    // 개별 클라이언트와의 통신을 담당하는 작업(스레드) 정의
    private static class ClientHandler implements Runnable {
        private final Socket socket;    // 클라이언트 소켓
        private final int clientId;     // 클라이언트 ID

        ClientHandler(Socket socket, int clientId) {
            this.socket = socket;
            this.clientId = clientId;
        }

        @Override
        public void run() {
            // 문자 단위 입출력 스트림 준비(UTF-8, autoFlush=true)
            try (
                    BufferedReader in = new BufferedReader(
                            new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
                    PrintWriter out = new PrintWriter(
                            new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8), true)
            ) {
                // 환영 메시지 및 종료 안내
                out.println("Welcome! You are Client#" + clientId + ". Type 'exit' to quit.");

                String line;

                // 클라이언트로부터 한 줄씩 입력 받아 처리
                while ((line = in.readLine()) != null) {
                    // 서버 콘솔에 수신 내용 로그
                    System.out.println("[Server] From Client#" + clientId + ": " + line);

                    // 'exit' 입력 시 종료 응답 후 루프 탈출
                    if ("exit".equalsIgnoreCase(line.trim())) {
                        out.println("Bye Client#" + clientId);
                        break;
                    }

                    // 에코 응답(받은 메시지를 그대로 돌려줌)
                    out.println("Echo to #" + clientId + ": " + line);
                }
            } catch (IOException e) {
                // 통신 중 I/O 예외 처리(보통 연결 끊김 등)
                System.err.println("[Server] Client#" + clientId + " I/O error: " + e.getMessage());
            } finally {
                // 소켓 정리 및 종료 로그
                try { socket.close(); } catch (IOException ignored) {}
                System.out.println("[Server] Client#" + clientId + " disconnected.");
            }
        }
    }
}