package jungol.배열1;

import java.util.Scanner;

public class 배열1_형성평가3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] N = new int[10];
        int even = 0;
        int odd = 0;

        for (int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            N[i] = a;
            if (i % 2 == 0) {
                odd += N[i];
            } else {
                even += N[i];
            }
        }
        System.out.printf("odd : %d\neven : %d", odd, even);
    }
}
