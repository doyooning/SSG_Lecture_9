package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_연습문제6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("세 수를 입력하세요. ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.printf("입력받은 수 중 가장 큰 수는 %d입니다.", a);
            } else {
                System.out.printf("입력받은 수 중 가장 큰 수는 %d입니다.", c);
            }
        } else {
            if (b > c) {
                System.out.printf("입력받은 수 중 가장 큰 수는 %d입니다.", b);
            } else {
                System.out.printf("입력받은 수 중 가장 큰 수는 %d입니다.", c);
            }
        }
    }
}
