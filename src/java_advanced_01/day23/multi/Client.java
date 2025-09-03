package java_advanced_01.day23.multi;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Client {
    public static void main(String[] args) {
        String host = "localhost";
        int port = 5000;

        try (Socket socket = new Socket(host, port);

             BufferedReader in = new BufferedReader(
                     new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
             PrintWriter pw = new PrintWriter(
                     new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8), true);
             ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());

             BufferedReader keyboard = new BufferedReader(
                     new InputStreamReader(System.in, StandardCharsets.UTF_8))
        ) {
            System.out.print("[Server] Client: ");
            String str = keyboard.readLine();
            oos.writeUTF(str);
//            oos.close();
            System.out.println("[Client] Connected to " + host + ":" + port);
            // 서버의 첫 인사 수신

//            String greet = in.readLine();
//            if (greet != null) System.out.println(greet);
//            pw.println(greet);

            String msg;
            while (true) {
                System.out.print("You> ");
                msg = keyboard.readLine();
                if (msg == null) break;   // EOF (Ctrl+D/Ctrl+Z)
                pw.println(msg);

                String resp = in.readLine();
                if (resp == null) {
                    System.out.println("[Client] Server closed connection.");
                    break;
                }
                System.out.println(resp);

                if ("exit".equalsIgnoreCase(msg.trim())) break;
            }
            System.out.println("[Client] Bye.");
        } catch (IOException e) {
            System.err.println("[Client] Error: " + e.getMessage());
        }
    }
}