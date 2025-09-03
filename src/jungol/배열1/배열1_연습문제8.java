package jungol.배열1;

import java.util.Scanner;

public class 배열1_연습문제8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] N = new int[10];
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            N[i] = a;
            sum += a;
        }
        System.out.printf("총점 = %d\n평균 = %.1f", sum, (double) sum / 10);
    }
}
