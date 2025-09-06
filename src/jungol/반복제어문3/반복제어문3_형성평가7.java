package jungol.반복제어문3;

import java.util.Scanner;

public class 반복제어문3_형성평가7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int charCount = 0;
        int numCount = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = n-i; j >= 0; j--) {
                // i = 1 ~ n까지 갈 때 -> j = n-1 ~ 0
                System.out.printf("%c ", (char) charCount +65);
                charCount++;
                // A = 65
            }
            for (int j = 2; j <= i; j++) {
                System.out.printf("%d ", numCount);
                numCount++;
            }
            System.out.println();
        }
    }
}
