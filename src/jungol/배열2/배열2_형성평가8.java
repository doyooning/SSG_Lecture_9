package jungol.배열2;

import java.util.Scanner;

public class 배열2_형성평가8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] N = new int[5][3];

        for (int i = 0; i < 4; i++) {
            int sum = 0;
            for (int j = 0; j < 2; j++) {
                int a = sc.nextInt();
                N[i][j] = a;
                sum += a;
            }
            N[i][2] = sum;
        }

        for (int i = 0; i < 2; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += N[j][i];
            }
            N[4][i] = sum;
        }

        //출력
        for (int i = 0; i < 4; i++) {
            N[4][2] += N[i][2];
            System.out.print(N[i][2] / 2 + " ");
        }
        System.out.println();
        for (int i = 0; i < 2; i++) {
            System.out.print(N[4][i] / 4 + " ");
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
        }
        System.out.print(N[4][2] / 8);
    }
}
