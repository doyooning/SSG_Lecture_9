package java_advanced_01.day21.practice;

import java.io.*;

// 문제 4: 바이트 단위 파일 쓰기
//         byte_output.txt 파일에 "ABCDEF"를 바이트 단위로 저장하고 성공하면 "저장완료"  출력하세요
public class Prob4 {

    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("C:/practice/byte_output.txt");
        byte[] bytes = {'A', 'B', 'C', 'D', 'E', 'F'};

        os.write(bytes);
        System.out.println("저장완료");
        os.close();
    }
}
