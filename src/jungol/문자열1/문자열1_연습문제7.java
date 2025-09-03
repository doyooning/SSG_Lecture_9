package jungol.문자열1;

import java.util.Scanner;

import static java.lang.Character.*;

public class 문자열1_연습문제7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] C = str.toCharArray();

        for (int i = 0; i < C.length; i++) {
            if (isUpperCase(C[i])) {
                C[i] = toLowerCase(C[i]);
            } else {
                C[i] = toUpperCase(C[i]);

            }
        }
        for (char c : C) {
            System.out.print(c);
        }
    }
}
