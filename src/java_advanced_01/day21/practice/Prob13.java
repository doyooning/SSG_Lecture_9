package java_advanced_01.day21.practice;

import java.io.*;

//문제 : 정수 100, 실수 3.14, 문자열 "Java" , 불리언 true 를 data.dat에 저장하고 다시 읽어 콘솔에 출력하세요
public class Prob13 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = null;
        DataOutputStream dos = null;
        fos = new FileOutputStream("data.dat");
        dos = new DataOutputStream(fos);

        dos.writeInt(100);
        dos.writeDouble(3.14);
        dos.writeUTF("Java");
        dos.writeBoolean(true);

        dos.flush();
        dos.close();
        fos.close();

        FileInputStream fis = null;
        DataInputStream dis = null;

        fis = new FileInputStream("data.dat");
        dis = new DataInputStream(fis);

        int num = dis.readInt();
        System.out.println(num);
        double  dbl = dis.readDouble();
        System.out.println(dbl);
        String str = dis.readUTF();
        System.out.println(str);
        boolean b = dis.readBoolean();
        System.out.println(b);

        dis.close();
        fis.close();
    }
}
