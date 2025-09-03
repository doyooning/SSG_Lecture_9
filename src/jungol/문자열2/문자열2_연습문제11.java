package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_연습문제11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";

        for (int i = 0; i < 3; i++) {
            double a = sc.nextDouble();
            String A = String.format("%.2f", a);
            str += A;
        }
        String[] S = str.split("\\.");
        for (int i = 0; i < S.length; i++) {
            System.out.println(S[i]);
        }
    }
}
