package jungol.배열2;

import java.util.Scanner;

public class 배열2_형성평가1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] N = new int[6];

        for (int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            N[a-1]++;
        }

        //출력
        for (int i = 0; i < 6; i++) {
            System.out.printf("%d : %d\n", i+1, N[i]);
        }
    }
}
