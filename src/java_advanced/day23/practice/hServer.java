package java_advanced.day23.practice;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class hServer {
    private static ServerSocket serverSocket = null;

    public static void main(String[] args) {
        try {
            serverSocket = new ServerSocket(50003);

            Socket socket = serverSocket.accept();
            System.out.println("[서버]와 연결이 되었습니다.");

            socket.close();
            System.out.println("[서버]와 연결이 해제되었습니다.");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}