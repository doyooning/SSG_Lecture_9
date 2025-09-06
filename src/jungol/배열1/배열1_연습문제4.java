package jungol.배열1;

import java.util.Scanner;

public class 배열1_연습문제4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] N = new int[100];

        for (int i = 0; i < 100; i++) {
            int a = sc.nextInt();
            if (a == 0) {
                break;
            }
            if (i % 2 == 1) {
                N[i] = a;
            }
        }
        for (int i : N) {
            if (i != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
