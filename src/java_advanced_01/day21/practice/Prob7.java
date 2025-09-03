package java_advanced_01.day21.practice;

import java.io.*;

// 문제 7: 파일 크기 출력
//        copy.jpg 파일의 크기를 바이트 단위로 출력하세요.
public class Prob7 {

    public static void main(String[] args) throws IOException {
        File file = new File("C:/practice/copy.jpg");

        System.out.println(file.length());
    }
}
