package java12_multi_thread.multiThreadPractice;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Client {
    public static void main(String[] args) {

        String host = "127.0.0.1";
        int port = 20000;

        try (Socket socket = new Socket(host, port);
                BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
             PrintWriter out = new PrintWriter(
                     new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8), true);
             BufferedReader keyboard = new BufferedReader(
                     new InputStreamReader(System.in, StandardCharsets.UTF_8))
        ) {
            System.out.println("[클라이언트] 연결 " + host + ":" + port);

            String greet = in.readLine();

            if (greet != null) {
                System.out.println(greet);
            }

            String msg;
            while (true) {
                System.out.print("[클라이언트]: ");
                msg = keyboard.readLine();
                if (msg == null) break;
                out.println(msg);
                String reply = in.readLine();
                if (reply == null) {
                    System.out.println("[클라이언트] 서버가 연결을 종료했습니다.");
                    break;
                }
                System.out.println(reply);
                if ("exit".equalsIgnoreCase(msg.trim())) break;
            }
            System.out.println("[클라이언트] 감사합니다.");
        } catch (IOException e) {
            System.out.println("[클라이언트] 에러: " + e.getMessage());
        }
    }
}
