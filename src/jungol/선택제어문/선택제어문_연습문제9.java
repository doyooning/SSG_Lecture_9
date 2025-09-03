package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_연습문제9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
