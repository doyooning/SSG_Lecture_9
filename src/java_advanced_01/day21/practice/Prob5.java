package java_advanced_01.day21.practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

// 문제 5: 바이트 단위 파일 읽기
//        byte_output.txt 파일을 읽어 화면에 출력하세요.
public class Prob5 {

    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("C:/practice/byte_output.txt");
        byte[] bytes = new byte[100];

        while (true) {
            int read = is.read(bytes);
            if(read == -1) break;
            for (int i = 0; i < read; i++) {
                System.out.print((char) bytes[i]);
            }
        }

    }
}
