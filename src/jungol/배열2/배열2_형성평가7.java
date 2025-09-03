package jungol.배열2;

import java.util.Scanner;

public class 배열2_형성평가7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] N1 = new int[2][3];
        int[][] N2 = new int[2][3];
        int[][] A = new int[2][3];

        System.out.println("first array");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                int a = sc.nextInt();
                N1[i][j] = a;
            }
        }

        System.out.println("second array");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                int a = sc.nextInt();
                N2[i][j] = a;
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = N1[i][j] * N2[i][j];
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}
