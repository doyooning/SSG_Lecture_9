package java_basic_02.day7;

import java.util.Scanner;

public class DoubleArrayEx01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] N = new int[3][5];

        for (int i = 0; i < 3; i++) {
            int sum = 0;
            System.out.printf("%d번째 학생의 점수 ", i+1);
            for (int j = 0; j < 3; j++) {
                int a = sc.nextInt();
                N[i][j] = a;
                sum += a;
            }
            N[i][3] = sum;
            N[i][4] = sum / 3;
        }

        System.out.println("     국어 영어 수학 총점 평균");
        for (int i = 0; i < 3; i++) {
            System.out.printf(" %d번 %3d %3d %3d %4d %3d\n", i+1, N[i][0], N[i][1], N[i][2], N[i][3], N[i][4]);
        }
    }
}
