package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_연습문제2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp;
        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }

        System.out.println("입력받은 수 중 큰 수는 " + a + "이고" + " 작은 수는 " + b + "입니다.");
    }
}
