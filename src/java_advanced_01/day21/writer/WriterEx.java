package java_advanced_01.day21.writer;

import java.io.FileWriter;
import java.io.Writer;

public class WriterEx {
    public static void main(String[] args) throws Exception{
        Writer writer = new FileWriter("C:/Temp/testChar.txt");

        // 문자씩 출력
        char ch1 = 'A';
        writer.write(ch1);
        char ch2 = 'B';
        writer.write(ch2);

        // char 배열 파일 출력
        char[] chars = {'C', 'D', 'E', 'F'};
        writer.write(chars);

        String str = "Hello World";
        writer.write(str);

        // 쓴 거 다 출력
        writer.flush();
        // 닫음
        writer.close();

    }
}
