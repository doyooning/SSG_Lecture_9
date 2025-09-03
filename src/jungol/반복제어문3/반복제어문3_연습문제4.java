package jungol.반복제어문3;

import java.util.Scanner;

public class 반복제어문3_연습문제4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n-i; j >= 1; j--) {
                // 공백 찍기 : 4-3-2-1-0개, 개수는 n-i개
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                // 별 찍기 : 1-2-3-4-5개, 개수는 i와 동일
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
