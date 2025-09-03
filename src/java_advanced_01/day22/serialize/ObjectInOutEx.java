package java_advanced_01.day22.serialize;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

// 자바는 메모리에 생성된 객체를 파일 또는 네트워크로 출력 가능
// 객체를 입출력할 수 있는 보조 스트림
// ObjectInputStream(바이트 스트림과 연결되어 객체로 복원하는 역직렬화)
// ObjectOutputStream(바이트 스트림과 연결되어 객체를 직렬화)
public class ObjectInOutEx {
    public static void main(String[] args) throws Exception {
        // C:/Temp/object.dat 에 파일 객체 + 파일입력스트림 객체 생성
        FileOutputStream fos = new FileOutputStream("C:/Temp/object.dat");
        // 생성된 파일입력스트림 객체에 객체출력스트림 객체를 끼워넣음
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // 객체 생성
        User user = new User("신세계", 20);
        Product product = new Product("삼성 노트북", 1500000);
        int[] arr1 = {10, 20, 30};
        List<Product> products = Arrays.asList(product);

        // 위 4개 객체를 object.dat 파일에 저장
        oos.writeObject(products);
        oos.writeObject(arr1);
        oos.writeObject(product);
        oos.writeObject(user);

        oos.flush();
        oos.close();
        fos.flush();
        fos.close();

        // 파일에서 읽어서 객체를 복원 - ObjectInputStream
        FileInputStream fis = new FileInputStream("C:/Temp/object.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        try {
            while (true) {
                Object obj = ois.readObject();
                if (obj.getClass().isArray()) {
                    obj = Array.getLength(obj);
                }
                System.out.println(obj);
            }
        } catch (EOFException e) {
            System.out.println("복원 완료");
        }
        ois.close();
        fis.close();
    }
}

@NoArgsConstructor
@AllArgsConstructor
@Data
class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Product implements Serializable {
    private static final long serialVersionUID = 2L;
    private String pname;
    private int price;
}