package jungol.입력;

import java.util.Scanner;

public class 입력_연습문제6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("당신의 나이는 몇 살입니까? ");
        int age = sc.nextInt();

        System.out.printf("당신의 나이는 %d살이군요.", age);
    }
}
