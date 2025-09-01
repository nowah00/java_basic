package java11_thread.hawon;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class hawonServer {
    private static ServerSocket serverSocket = null;

    public static void main(String[] args) {
        System.out.println("---------------------");
        System.out.println("Hawon Server Started");
        System.out.println("---q or Q -> Exit---");
        System.out.println("---------------------");

        startServer();

        Scanner scanner = new Scanner(System.in);
        while(true) {
            String line = scanner.nextLine();
            if(line.equalsIgnoreCase("q")) break;
        }
        scanner.close();

        closeServer();
    }

    public static void startServer() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    serverSocket = new ServerSocket(50005);
                    System.out.println("[서버] 시작");

                    while(true) {
                        System.out.println("[서버] 연결 대기 중");
                        Socket socket = serverSocket.accept();

                        InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
                        System.out.println("[서버] " + isa.getAddress() + ":" + isa.getPort() + " 연결 완료");

                        socket.close();
                        System.out.println("[서버] 연결 종료");
                    }
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        };
        thread.start();
    }

    public static void closeServer() {
        try {
            serverSocket.close();
            System.out.println("[서버] 종료");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
