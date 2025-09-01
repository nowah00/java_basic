package practice11_thread.socket01.aloneSocket;

import java.io.IOException;
import java.net.Socket;

public class ClientSocketEx {

    public static void main(String[] args) {

        try {
            Socket socket = new Socket("localhost",50002);
            System.out.println("Server Connected");

            socket.close();
            System.out.println("Server Disconnected");
        } catch (IOException e) {
            System.out.println("Server Disconnected");
        }
    }
}
