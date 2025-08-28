package java_advanced.day23.practice.multiserverecho;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class Client {
    public static void main(String[] args) {
        // 클라이언트가 연결하려는 서버 포트
        String host = "127.0.0.1";
        int port = 5000;

        try (Socket socket = new Socket(host, port);
             BufferedReader in = new BufferedReader(
                     new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
             PrintWriter out = new PrintWriter(
                     new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8), true);
             BufferedReader keyboard = new BufferedReader(
                     new InputStreamReader(System.in, StandardCharsets.UTF_8))
        ) {
            System.out.println("[Client] Connected to " + host + ":" + port);
            // 서버의 첫 인사 수신
            String greet = in.readLine();
            if (greet != null) {
                System.out.println(greet);
            }

            String msg;
            while (true) {
                // 서버와 연결된 모든 클라이언트에게 작성한 메시지를 전송
                System.out.print("You> ");
                msg = keyboard.readLine();
                if (msg == null) {
                    break;   // EOF (Ctrl+D/Ctrl+Z)
                }
                out.println(msg);

                // 서버 측의 응답을 수신
                String resp = in.readLine();
                if (resp == null) {
                    System.out.println("[Client] Server closed connection.");
                    break;
                }
                System.out.println(resp);

                // 채팅창에 exit이 입력되면 클라이언트를 종료
                if ("exit".equalsIgnoreCase(msg.trim())) {
                    break;
                }
            }
            System.out.println("[Client] Bye.");
        } catch (IOException e) {
            System.err.println("[Client] Error: " + e.getMessage());
        }
    }
}
