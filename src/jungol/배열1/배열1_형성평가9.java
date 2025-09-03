package jungol.배열1;

import java.util.Scanner;

public class 배열1_형성평가9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] N = new int[100];
        int index = 0;

        for (int i = 0; i < 100; i++) {
            int a = sc.nextInt();
            if (a == 0) {
                break;
            }
            N[i] = a;
            index++;
        }
        System.out.println(index);

        for (int i = 0; i < index; i++) {
            if (N[i] % 2 == 1) {
                System.out.print(2 * N[i] + " ");
            } else {
                System.out.print(N[i] / 2 + " ");
            }
        }
    }
}
