package jungol.배열2;

import java.util.Scanner;

public class 배열2_형성평가9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] N = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                if (j == 0) {
                    N[i][j] = 1;
                } else {
                    N[i][j] = N[i-1][j-1] + N[i-1][j];
                }
            }
        }

        //출력
        for (int i = n-1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                if (N[i][j] != 0) {
                    System.out.print(N[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
