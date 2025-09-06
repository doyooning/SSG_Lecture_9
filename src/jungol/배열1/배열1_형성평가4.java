package jungol.배열1;

import java.util.Scanner;

public class 배열1_형성평가4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] N = new int[100];
        int index = -1;
        int count = 0;

        for (int i = 0; i < 100; i++) {
            int a = sc.nextInt();
            if (a == -1) {
                break;
            }
            N[i] = a;
            index++;
            count++;
        }

        if (count >= 3) {
            for (int i = index-2; i <= index; i++) {
                System.out.print(N[i] + " ");
            }
        } else {
            for (int i = 0; i < count; i++) {
                System.out.print(N[i] + " ");
            }
        }
    }
}
