package jungol.반복제어문3;

import java.util.Scanner;

public class 반복제어문3_형성평가8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int charCount = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < 2*(i-1); j++) {
                // i = 1일 때 작동X | i = 2일 때부터 2배수로
                System.out.print(" ");
            }
            for (int j = n-i; j >= 0; j--) {
                charCount++;
                System.out.printf("%d ", charCount);
            }
            System.out.println();
        }
    }
}
