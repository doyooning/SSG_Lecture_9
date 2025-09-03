package jungol.배열2;

import java.util.Scanner;

public class 배열2_연습문제1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] N = new int[10];

        while (true) {
            int a = sc.nextInt();

            if ((a < 1) || (a > 10)) {
                break;
            }

            N[a-1]++;
        }

        for (int i = 0; i < 10; i++) {
            if (N[i] > 0) {
                System.out.printf("%d : %d개\n", i+1, N[i]);
            }
        }
    }
}
