package java11_thread.socket01.aloneSocket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerSocketEx {

    private static ServerSocket serverSocket = null;

    public static void main(String[] args) {
        System.out.println("Starting Server");
        System.out.println("-q, Q -> Exit-");
        System.out.println("---------------");

        //서버 시작
        startServer();

        //입력
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String key = scanner.nextLine();
            if (key.toUpperCase().equals("Q")) break;
        }

        //서버 종료
        stopServer();
    }

    public static void startServer() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    serverSocket = new ServerSocket(50002);
                    System.out.println("Server Started");
                    while (true) {
                        System.out.println("Server Loading");

                        Socket socket = serverSocket.accept();

                        InetSocketAddress ia = (InetSocketAddress) socket.getRemoteSocketAddress();
                        System.out.println("Server IP" + ia.getAddress() + ":" + ia.getPort() + "Connected");

                        socket.close();
                        System.out.println("Server Stopped");
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        thread.start();
    }

    public static void stopServer() {
        try {
            serverSocket.close();
            System.out.println("Server stopped");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
