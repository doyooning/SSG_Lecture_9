package jungol.문자열1;

import java.util.Scanner;

public class 문자열1_연습문제1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            char a = sc.next().charAt(0);
            System.out.printf("%c -> %d\n", a, (int)a);

            if (a == '0') {
                break;
            }
        }
    }
}
