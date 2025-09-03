package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_형성평가6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int n = sc.nextInt();

        StringBuffer sb = new StringBuffer(a);
        sb.append(b);
        StringBuffer sb2 = new StringBuffer(b);
        sb2.replace(0, n, sb.substring(0, n));

        System.out.println(sb);
        System.out.println(sb2);
    }
}
