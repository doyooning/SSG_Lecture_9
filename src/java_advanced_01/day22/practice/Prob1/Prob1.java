package java_advanced_01.day22.practice.Prob1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Prob1 {

    public static void main(String[] args) throws IOException {
        Person person = new Person("홍길동", 30);

        Path path = Paths.get("person.dat");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(person);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            while (true) {
                Person p = (Person) ois.readObject();
                System.out.println(p);
            }
        } catch (IOException e) {
            System.out.println("완료");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
