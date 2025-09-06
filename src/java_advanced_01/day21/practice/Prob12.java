package java_advanced_01.day21.practice;

import java.io.*;

//문제 : 10,20,30 을 numbers.dat 파일에 저장하고 다시 읽어 콘솔에 출력하세요
public class Prob12 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = null;
        DataOutputStream dos = null;
        fos = new FileOutputStream("numbers.dat");
        dos = new DataOutputStream(fos);

        dos.writeInt(10);
        dos.writeInt(20);
        dos.writeInt(30);

        dos.flush();
        dos.close();
        fos.close();

        FileInputStream fis = null;
        DataInputStream dis = null;

        fis = new FileInputStream("numbers.dat");
        dis = new DataInputStream(fis);

        for (int i = 0; i < 3; i++) {
            int num = dis.readInt();
            System.out.println(num);
        }
        dis.close();
        fis.close();
    }
}
