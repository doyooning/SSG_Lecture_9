package java_advanced_01.day22.practice.Prob5;

import java.io.*;

public class Prob5 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:/Temp/practice/order.dat");
        try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            Order order = new Order(1234, new Product("Apple", 5000));
            oos.writeObject(order);
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileInputStream fis = new FileInputStream("C:/Temp/practice/order.dat");
        try (ObjectInputStream ois = new ObjectInputStream(fis)) {
            while (true) {
                Object obj = ois.readObject();
                System.out.println(obj);
            }
        } catch (EOFException e) {
            System.out.println("완료");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
