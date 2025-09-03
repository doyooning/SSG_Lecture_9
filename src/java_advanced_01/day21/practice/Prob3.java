package java_advanced_01.day21.practice;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

// 문제 3: 텍스트 파일에 저장된 문자 수 세기
//         hello.txt 파일의 문자 수를 세어 화면에 출력하세요.
public class Prob3 {

    public static void main(String[] args) throws IOException {
        Reader reader = null;
        reader = new FileReader("C:/practice/hello.txt");

        int count = 0;
        while (true) {
            int data = reader.read();
            if (data == -1) break;
            count++;
        }
        System.out.println(count);
        reader.close();
    }
}
