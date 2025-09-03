package jungol.배열2;

import java.util.Scanner;

public class 배열2_연습문제6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] N = new int[4][4];

        for (int i = 0; i < 3; i++) {
            int sum = 0;
            System.out.printf("%d번째 학생의 점수 ", i+1);
            for (int j = 0; j < 3; j++) {
                int a = sc.nextInt();
                N[i][j] = a;
                sum += a;
            }
            N[i][3] = sum;
        }
        for (int i = 0; i < 4; i++) {
            int sum = 0;
            for (int j = 0; j < 3 ; j++) {
                sum += N[j][i];
            }
            N[3][i] = sum;
        }

        System.out.printf("     국어 영어 수학 총점\n");
        for (int i = 0; i < 3; i++) {
            System.out.printf(" %d번 %3d %3d %3d %3d\n", i+1, N[i][0], N[i][1], N[i][2], N[i][3]);
        }
        System.out.printf("합계 %3d %3d %3d %3d", N[3][0], N[3][1], N[3][2], N[3][3]);
    }
}
