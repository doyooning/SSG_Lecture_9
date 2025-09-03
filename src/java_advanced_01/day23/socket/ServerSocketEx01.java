package java_advanced_01.day23.socket;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/* TCP 서버 프로그램을 개발하려면 우선 ServerSocket 객체를 생성해야 함
 * ServerSocket은 Port를 가져야 함 - 50001번으로 가보자
 * 1. ServerSocket server = new ServerSocket(50001);
 *
 * 2. ServerSocket server = new ServerSocket();
 *    server.bind(new InetSocketAddress("192.16.180.181", 50001));
 *    -> 더 안전한 방식(중간에 포트 번호 변경 가능)
 * ServerSocket이 생성되었다면 연결 요청이 수락을 위해 accept()을 실행해야 함
 * accept()메서드는 클라가 연결 요청하기 전까지 블로킹(실행 멈춘 상태)
 * 클라 연결 요청이 오면 블로킹 해제, 통신용 Socket 리턴
 *
 * Socket socket = server.accept();
 * */
public class ServerSocketEx01 {
    private static ServerSocket serverSocket = null;
    public static void main(String[] args) {
        System.out.println("--------------Starting Server Socket--------------");
        System.out.println("서버를 종료하려면 q또는 Q를 입력하고 Enter키를 입력하세요 ");
        System.out.println("--------------------------------------------------");

        // TCP 서버 시작
        startServer();

        // 키보드 입력
        Scanner sc = new Scanner(System.in);
        while (true) {
            String key = sc.nextLine();
            if (key.toLowerCase().equals("q")) {
                break;
            }
        }

        // TCP 서버 종료
        stopServer();
    }

    public static void startServer() {
        // Thread 스레드 : 실행단위
        Thread thread = new Thread() {
            @Override
            public void run() {
            try {
                serverSocket = new ServerSocket(50001);
                System.out.println("[서버] 시작됨");
                while (true) {
                    System.out.println("\n[서버] 연결 요청을 기다리는 중");
                    // 연결 수락
                    Socket socket = serverSocket.accept();

                    // 연결된 클라이언트의 정보 얻기
                    InetSocketAddress ia = (InetSocketAddress) socket.getRemoteSocketAddress();
                    System.out.println("[서버] " + ia.getAddress() + ":" + ia.getPort() + "의 연결 수락함");

                    // 연결 끊기
                    socket.close();
                    System.out.println("[서버] 연결 종료");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            }
        };
        thread.start();
    }

    public static void stopServer() {
        try {
            serverSocket.close();
            System.out.println("서버 종료");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
