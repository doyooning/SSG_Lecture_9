package jungol.반복제어문2;

import java.util.Scanner;

public class 반복제어문2_형성평가10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 1; i <= 9; i++) {
            if (a > b) {
                for (int j = a; j >= b; j--) {
                    System.out.printf("%d * %d = %2d   ", j, i, j * i);
                }
            } else {
                for (int j = a; j <= b; j++) {
                    System.out.printf("%d * %d = %2d   ", j, i, j * i);
                }
            }
            System.out.println();
        }
    }
}
