package jungol.함수1;

import java.util.Scanner;

public class 함수1_연습문제3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printStar(n);
    }

    public static void printStar(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
