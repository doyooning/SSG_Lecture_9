package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_형성평가9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        double b = sc.nextDouble();
        String c = sc.next();

        String str = String.valueOf(a) + String.format("%.3f", b) + c;

        if (str.length() % 2 == 1) {
            System.out.println(str.substring(0, (str.length() / 2) + 1));
            System.out.println(str.substring((str.length() / 2) + 1));
        } else {
            System.out.println(str.substring(0, str.length() / 2));
            System.out.println(str.substring(str.length() / 2));
        }
    }
}
