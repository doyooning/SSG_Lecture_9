package jungol.배열1;

import java.util.Scanner;

public class 배열1_행복 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] N = new int[n];

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            N[i] = a;
        }

        int max = N[0];
        int min = N[0];

        for (int i = 0; i < n; i++) {
            if (N[i] > max) {
                max = N[i];
            }
            if (N[i] < min) {
                min = N[i];
            }
        }
        System.out.println(max - min);
    }
}
