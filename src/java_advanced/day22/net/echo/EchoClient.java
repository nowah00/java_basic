package java_advanced.day22.net.echo;

import java.io.IOException;
import java.net.Socket;

public class EchoClient {
    public static void main(String[] args) {
    //Socket 생성과 동시에 localhost
        try {
            Socket socket = new Socket("localhost", 50001);
            System.out.println("Connected to server 성공!");

            socket.close();
            System.out.println("클라이언트 연결 종료");

        } catch (IOException e) {
            System.out.println("연결 실패..");
        }


    }
}
