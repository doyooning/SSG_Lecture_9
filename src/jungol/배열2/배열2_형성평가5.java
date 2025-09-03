package jungol.배열2;

import java.util.Scanner;

public class 배열2_형성평가5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] N = new int[4][4];

        for (int i = 0; i < 4; i++) {
            System.out.printf("%dclass? ", i+1);
            for (int j = 0; j < 3; j++) {
                int a = sc.nextInt();
                N[i][j] = a;
                N[i][3] += N[i][j];
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.printf("%dclass : %d\n", i+1, N[i][3]);
        }
    }
}
