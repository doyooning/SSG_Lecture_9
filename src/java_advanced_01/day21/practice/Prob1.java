package java_advanced_01.day21.practice;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

// 문제 1: 텍스트 파일에 문자열 저장
//         문자열 "Hello Java!"를 hello.txt에 저장하세요.
public class Prob1 {

    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("C:/practice/hello.txt");
        writer.write("Hello Java!");
        writer.close();
    }
}
