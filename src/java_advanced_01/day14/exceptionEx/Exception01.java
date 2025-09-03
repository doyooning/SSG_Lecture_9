package java_advanced_01.day14.exceptionEx;
//컴파일 예외 클래스 종류와 처리

/*
* 컴파일 예외 클래스 종류와 처리
* 1. IOException : 입출력을 다루는 메서드는 IOException 처리하도록
* 2. FileNotFoundException : 파일에 접근하려고 하는데 지정 위치에 해당 파일이 없다
*
* 예외 처리 방법
* 1. try ~ catch ~
* 2. throws ~exception
* */

import java.io.*;

public class Exception01 {
    public static void main(String[] args) throws IOException {
        byte[] list = {'a', 'b', 'c'};
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.newLine(); // BufferedWriter 등은 예외 처리 반드시 필요(IOException)

        try { // FileReader는 예외 처리 반드시 필요(FileNotfoundException)
            BufferedReader bf = new BufferedReader(new FileReader("test.txt"));
        } catch (FileNotFoundException e) {
            e.getMessage();
        }

    }
}
