package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_연습문제4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        if (a.length() <= b.length()) {
            System.out.printf("%s\n%s", a, b);
        } else {
            System.out.printf("%s\n%s", b, a);
        }
    }
}
