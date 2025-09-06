package jungol.배열1;

import java.util.Scanner;

public class 배열1_형성평가8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] N = new int[100];
        int index = 0;
        int count = 0;
        int sum = 0;

        for (int i = 0; i < 100; i++) {
            int a = sc.nextInt();
            if (a == 0) {
                break;
            }
            N[i] = a;
            index++;
        }
        for (int i = 0; i < index; i++) {
            if (N[i] % 5 == 0) {
                sum += N[i];
                count++;
            }
        }
        double avg = (double) sum / count;
        System.out.printf("Multiples of 5 : %d\nsum : %d\navg : %.1f", count, sum, avg);
    }
}
