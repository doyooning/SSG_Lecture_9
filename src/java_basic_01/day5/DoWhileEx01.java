package java_basic_01.day5;

import java.util.Scanner;

public class DoWhileEx01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("메세지를 입력하세요. ");
        System.out.println("프로그램을 종료하려면 q를 입력하세요. ");
        String inputString;

        do {
            System.out.print("> ");
            inputString = sc.nextLine();
            System.out.println(inputString);
        } while (!inputString.equals("q"));
        System.out.println("-------------");
        System.out.println("채팅 종료");
    }
}
