package java_advanced_01.day22.practice.Prob3;

import java_advanced_01.day22.practice.Prob2.Book;

import java.io.*;

public class Prob3 {
    public static void main(String[] args) throws IOException {
        Student student1 = new Student("신세계", 90);
        Student student2 = new Student("이세계", 85);
        Student[] students = {student1, student2};

        FileOutputStream fos = new FileOutputStream("C:/Temp/practice/students.dat");
        try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            for (Student s : students) {
                oos.writeObject(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileInputStream fis = new FileInputStream("C:/Temp/practice/students.dat");
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
