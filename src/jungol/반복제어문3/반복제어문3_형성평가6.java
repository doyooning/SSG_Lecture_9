package jungol.반복제어문3;

import java.util.Scanner;

public class 반복제어문3_형성평가6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int count = 1; // 1 ~ i, 줄 바뀔 때마다 1로 초기화
            for (int j = 2*(n-i); j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d ",count);
                count++;
            }
            System.out.println();
        }
    }
}
