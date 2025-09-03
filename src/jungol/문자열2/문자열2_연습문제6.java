package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_연습문제6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        String newA = b.substring(0, 3) + a.substring(3);
        String newB = b + a.substring(0, 3);

        System.out.println(newA);
        System.out.println(newB);
    }
}
