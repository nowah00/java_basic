package java11_thread;

import java.net.InetAddress;
import java.net.UnknownHostException;

//자신의 컴퓨터의 IP 주소를 얻어내는 방법
public class InetAddressEx {
    public static void main(String[] args) {

        InetAddress inetAddress = null;
        try {
            inetAddress = InetAddress.getLocalHost();
            System.out.println("나의 IP 주소값: " + inetAddress);
            InetAddress[] iaAddress = InetAddress.getAllByName("www.naver.com");
            for (InetAddress address : iaAddress) {
                System.out.println("Naver의 IP 주소: 값" + address.getHostAddress());
            }
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }



    }
}
