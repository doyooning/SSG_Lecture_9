package jungol.함수1;

import java.util.Scanner;

public class 함수1_연습문제2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNum(n);
    }

    public static void printNum(int num) {
        System.out.printf("10큰수 : %d\n", num + 10);
        System.out.printf("10작은수 : %d\n", num - 10);
    }
}
