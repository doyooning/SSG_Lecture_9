package jungol.배열1;

import java.util.Scanner;

public class 배열1_형성평가7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] N = new int[100];
        int max = 0;
        int min = 0;
        int count = 0;

        for (int i = 0; i < 100; i++) {
            int a = sc.nextInt();
            if (a == 999) {
                break;
            }
            N[i] = a;
            count++;
        }
        max = N[0];
        min = N[0];

        for (int i = 0; i < count; i++) {
            if (N[i] > max) {
                max = N[i];
            }
            if (N[i] < min) {
                min = N[i];
            }
        }
        System.out.printf("max : %d\nmin : %d", max, min);
    }
}
