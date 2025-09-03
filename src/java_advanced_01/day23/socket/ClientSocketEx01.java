package java_advanced_01.day23.socket;

/* 클라이언트가 서버에서 연결요청을 하려면 Socket 객체를 생성하고
    생성자 매개값에 서버 IP, Port(필수값)을 제공

* Socket socket = new Socket("IP", 50001);
*
* */

import java.io.IOException;
import java.net.Socket;

public class ClientSocketEx01 {
    public static void main(String[] args) {
        // Socket 생성과 동시에 localhost
        try {
            Socket socket = new Socket("localhost", 50001);
            System.out.println("클라이언트 연결 성공");

            socket.close();
            System.out.println("클라이언트 연결 종료");
        } catch (IOException e) {
            System.out.println("연결 실패");
        }
    }
}
