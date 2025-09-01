package practice12_multi_thread.multiThreadPractice;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Server {
    private static final int PORT = 20000;
    private static final ExecutorService POOL = Executors.newCachedThreadPool();
    private static final AtomicInteger CLIENT_SEQ = new AtomicInteger(1);

    public static void main(String[] args) {

        System.out.println("[서버] 시작 " + PORT );
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("\n[서버] 종료");
            POOL.shutdown();
        }));

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            while (true) {
                Socket socket = serverSocket.accept();
                int id = CLIENT_SEQ.getAndIncrement();
                POOL.submit(new ClientHandler(socket, id));
            }
        } catch (IOException e) {
            System.out.println("[서버] 에러: " + e.getMessage());
        }
    }

    private static class ClientHandler implements Runnable {
        private final Socket socket;
        private final int clientId;

        ClientHandler(Socket socket, int clientId) {
            this.socket = socket;
            this.clientId = clientId;
        }

    @Override
    public void run() {
        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
             PrintWriter out = new PrintWriter(
                     new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8), true)
        ) {
            out.println("환영합니다! " + clientId +"님 끝내시려면 'Exit' 를 입력해주세요.");
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println("[서버] 클라이언트에게 온 메세지 " + clientId + ": " + line);
                if ("exit".equalsIgnoreCase(line.trim())) {
                    out.println("감사합니다. " + clientId + "님");
                    break;
                }
                out.println("클라이언트가 보낸 메세지 " + clientId + ": " + line);
            }
        } catch (IOException e) {
            System.out.println("[서버] 클라이언트 " + clientId + "IO error: " + e.getMessage() );
        } finally {
            try {
                socket.close();} catch (IOException ignored) {} //IOException ignored -> 무시
            System.out.println("[서버] 클라이언트 " + clientId + " 연결 종료");;
            }
        }
    }
}