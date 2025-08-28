package java_advanced.day23.practice;

import java.io.IOException;
import java.net.Socket;

public class hClient {
    public static void main(String[] args) {

        try {
            Socket socket = new Socket("localhost",50003);
            System.out.println("서버 접속 성공!");

            socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
