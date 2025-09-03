package jungol.배열1;

import java.util.Scanner;

public class 배열1_형성평가10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] N = new int[n];

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            N[i] = a;
        }

        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
                if (N[j] < N[j+1]) { // 버블정렬
                    temp = N[j];
                    N[j] = N[j+1];
                    N[j+1] = temp;
                }
            }
        }
        for (int i : N) {
            System.out.println(i);
        }
    }
}
