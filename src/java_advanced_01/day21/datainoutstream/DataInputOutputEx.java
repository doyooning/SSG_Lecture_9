package java_advanced_01.day21.datainoutstream;

import java.io.*;

public class DataInputOutputEx {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = null;
        DataOutputStream dos = null;
        // file - data 순으로 시작
        fos = new FileOutputStream("primitive.db");
        dos = new DataOutputStream(fos);

        dos.writeUTF("쓰기");
        dos.writeInt(10);
        dos.writeDouble(11.1);
        dos.writeBoolean(true);

        // data - file 순서로 close 해준다
        dos.flush();
        dos.close();
        fos.close();

        FileInputStream fis = null;
        DataInputStream dis = null;

        fis = new FileInputStream("primitive.db");
        dis = new DataInputStream(fis);

        for (int i = 0; i < 5; i++) {
            String name = dis.readUTF();
            int age = dis.readInt();
            double price = dis.readDouble();
            boolean flag = dis.readBoolean();
            System.out.println(name + " " + age + " " + price + " " + flag);
        }
        dis.close();
        fis.close();
    }
}
