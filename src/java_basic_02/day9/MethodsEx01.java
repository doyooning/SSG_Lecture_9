package java_basic_02.day9;

import java.util.Scanner;

public class MethodsEx01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("몇 번을 수행할까요?");
        count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.println(i+1 + "번째 호출");
            method();
        }
    }

    public static void method() {
        System.out.println("Static Method");
        System.out.println("5 + 6 = 11");
    }
}
