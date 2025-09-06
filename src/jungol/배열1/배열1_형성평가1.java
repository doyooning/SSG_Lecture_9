package jungol.배열1;

import java.util.Scanner;

public class 배열1_형성평가1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] C = new char[10];

        for (int i = 0; i < 10; i++) {
            char a = sc.next().charAt(0);
            C[i] = a;
        }

        for (int i = 9; i >= 0; i--) {
            System.out.print(C[i] + " ");
        }
    }
}
