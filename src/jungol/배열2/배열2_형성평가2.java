package jungol.배열2;

import java.util.Scanner;

public class 배열2_형성평가2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] N = new int[11];
        int count = 0;

        while (true) {
            int a = sc.nextInt();

            if (a == 0) {
                break;
            }
            int d = a / 10;
            N[d]++;
            count++;
        }

        //출력
        for (int i = N.length-1; i >= 0; i--) {
            if (N[i] > 0) {
                System.out.printf("%d : %d person\n", 10*i, N[i]);
            }
        }
    }
}
