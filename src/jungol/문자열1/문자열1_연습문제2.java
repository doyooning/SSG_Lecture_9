package jungol.문자열1;

import java.util.Scanner;

public class 문자열1_연습문제2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";
        while (true) {
            String a = sc.nextLine();
            s += String.valueOf(a);
            if (a.isEmpty()) {
                break;
            }
        }
        System.out.println(s);
    }
}