package jungol.배열2;

import java.util.Scanner;

public class 배열2_연습문제2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] N = new int[10];
        int count = 0;

        while (true) {
            int a = sc.nextInt();

            if (a == 0) {
                break;
            }
            int d = a % 10;
            N[d]++;
            count++;
        }

        for (int i = 0; i < count; i++) {
            if (N[i] > 0) {
                System.out.printf("%d : %d개\n", i, N[i]);
            }
        }
    }
}
