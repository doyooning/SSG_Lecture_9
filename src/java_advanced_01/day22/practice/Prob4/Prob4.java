package java_advanced_01.day22.practice.Prob4;

import java.io.*;

public class Prob4 {
    public static void main(String[] args) throws IOException {
        Account account = new Account("철수", 10000);
        writeObject(account);

        readObject();
    }

    public static void writeObject(Account account) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:/Temp/practice/account.dat");
        try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            Account newAcc = new Account(account.getOwner(), account.getBalance());
            oos.writeObject(newAcc);
            oos.writeInt(account.getBalance());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readObject() throws IOException {
        FileInputStream fis = new FileInputStream("C:/Temp/practice/account.dat");
        try (ObjectInputStream ois = new ObjectInputStream(fis)) {
            while (true) {
                Object obj = ois.readObject();
                int i = ois.readInt();
                System.out.println(obj);
                System.out.println(i);
            }
        } catch (EOFException e) {
            System.out.println("완료");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
