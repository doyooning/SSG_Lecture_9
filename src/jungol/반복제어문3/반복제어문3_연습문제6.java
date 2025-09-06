package jungol.반복제어문3;

import java.util.Scanner;

public class 반복제어문3_연습문제6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1; // 사용할 숫자 초기화

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) { // 별 찍기랑 동일 for문
                System.out.printf("%d ", count);
                count++; // 반복할 때마다 카운트 ++
            }
            System.out.println();
        }
    }
}
