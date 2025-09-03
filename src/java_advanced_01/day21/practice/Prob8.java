package java_advanced_01.day21.practice;

import java.io.*;

// 문제 8: 한 줄 입력 후 출력사용자로부터 문자열을 한 줄 입력받아 그대로 출력하는 프로그램을 작성하세요.
// 사용자가 입력한 여러 줄을 받아 multi.txt 파일에 저장하세요. (exit 입력 시 종료)
public class Prob8 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Writer writer = new FileWriter("C:/practice/multi.txt");

        while (true) {
            String str = br.readLine();
            if (str.equals("exit")) break; {}
            System.out.println(str);
            writer.write(str + "\n");
        }
        br.close();
        writer.close();

    }
}
