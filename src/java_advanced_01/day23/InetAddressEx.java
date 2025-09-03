package java_advanced_01.day23;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {
    public static void main(String[] args) {
        InetAddress inetAddress = null;
        try {
            inetAddress = InetAddress.getLocalHost();
            System.out.println("나의 IP주소값: " + inetAddress);
            InetAddress[] inetAddress2 = InetAddress.getAllByName("www.naver.com");

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }
}
