package jungol.문자열1;

import java.util.Scanner;

public class 문자열1_연습문제3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "jungol olympiad";
        char[] C = str.toCharArray();

        for (int i = 0; i < 5; i++) {
            int n = sc.nextInt();
            System.out.print(C[n]);
        }

    }
}
