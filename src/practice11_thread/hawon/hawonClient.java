package practice11_thread.hawon;

import java.io.IOException;
import java.net.Socket;

public class hawonClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost",50005);
            System.out.println("[클라이언트] 연결 완료");

            socket.close();
            System.out.println("[클라이언트] 연결 종료");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
