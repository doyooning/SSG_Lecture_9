package jungol.배열1;

import java.util.Scanner;

public class 배열1_형성평가2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] N = new int[5];

        for (int i = 0; i < 5; i++) {
            int a = sc.nextInt();
            N[i] = a;
        }
        System.out.println(N[0] + N[2] + N[4]);
    }
}
