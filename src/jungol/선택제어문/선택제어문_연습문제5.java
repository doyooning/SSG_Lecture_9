package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_연습문제5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("주사위를 두 번 던진 결과를 입력하세요. ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if ((a >= 4) && (b >= 4)) {
            System.out.println("이겼습니다.");
        } else if ((a >= 4) || (b >= 4)) {
            System.out.println("비겼습니다.");
        } else {
            System.out.println("졌습니다.");
        }

    }
}
