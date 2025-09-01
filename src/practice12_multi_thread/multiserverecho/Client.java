package practice12_multi_thread.multiserverecho;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class Client {
    public static void main(String[] args) {

        // 접속 대상 서버 주소/포트
        String host = "127.0.0.1";
        int port = 50000;

        // try-with-resources: 소켓/스트림 자동 종료
        try (Socket socket = new Socket(host, port);
             // 서버 → 클라이언트: 수신용(UTF-8, 라인 단위 읽기)
             BufferedReader in = new BufferedReader(
                     new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
             // 클라이언트 → 서버: 송신용(UTF-8, autoFlush=true 로 println시 즉시 전송)
             PrintWriter out = new PrintWriter(
                     new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8), true);
             // 키보드 입력: 사용자 콘솔에서 한 줄씩 읽기
             BufferedReader keyboard = new BufferedReader(
                     new InputStreamReader(System.in, StandardCharsets.UTF_8))
        ) {
            System.out.println("[Client] Connected to " + host + ":" + port);

            // 서버 환영 메시지 1줄 수신 후 출력(없으면 skip)
            String greet = in.readLine();
            if (greet != null) {
                System.out.println(greet);
            }

            String msg;
            while (true) {
                // 사용자 입력 프롬프트
                System.out.print("You> ");
                // 키보드에서 한 줄 읽기(null이면 EOF → 종료)
                msg = keyboard.readLine();
                if (msg == null) {
                    break;
                }

                // 입력한 메시지를 서버로 전송
                out.println(msg);

                // 서버의 에코/응답 수신(null이면 서버가 연결 종료)
                String resp = in.readLine();
                if (resp == null) {
                    System.out.println("[Client] Server closed connection.");
                    break;
                }
                // 서버 응답 보여주기
                System.out.println(resp);

                // 사용자가 exit 입력하면 클라이언트 루프 종료
                if ("exit".equalsIgnoreCase(msg.trim())) {
                    break;
                }
            }

            System.out.println("[Client] Bye.");
        } catch (IOException e) {
            // 연결/입출력 오류 처리
            System.err.println("[Client] Error: " + e.getMessage());
        }
    }
}