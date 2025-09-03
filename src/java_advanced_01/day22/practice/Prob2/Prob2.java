package java_advanced_01.day22.practice.Prob2;

import java.io.*;
import java.util.ArrayList;

public class Prob2 {
    public static void main(String[] args) throws IOException {
        ArrayList<Book> books = new ArrayList<>();
        Book book1 = new Book("자바굿", 10000);
        Book book2 = new Book("파이썬굿", 12000);
        Book book3 = new Book("C++굿", 14000);
        books.add(book1);
        books.add(book2);
        books.add(book3);

        FileOutputStream fos = new FileOutputStream("C:/Temp/practice/books.dat");
        try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            for (Book b : books) {
                oos.writeObject(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileInputStream fis = new FileInputStream("C:/Temp/practice/books.dat");
        try (ObjectInputStream ois = new ObjectInputStream(fis)) {
            while (true) {
                Object obj = ois.readObject();
                System.out.println(obj);
            }
        } catch (IOException e) {
            System.out.println("완료");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
