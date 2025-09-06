package jungol.배열2;

import java.util.Scanner;

public class 배열2_연습문제5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] N1 = new int[3][3];
        int[][] N2 = new int[3][3];

        for (int i = 0; i < 3; i++) {
            System.out.printf("첫 번째 배열 %d행 ", i+1);
            for (int j = 0; j < 3; j++) {
                int a = sc.nextInt();
                N1[i][j] = a;
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.printf("두 번째 배열 %d행 ", i+1);
            for (int j = 0; j < 3; j++) {
                int a = sc.nextInt();
                N2[i][j] = a;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(N1[i][j]+N2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
