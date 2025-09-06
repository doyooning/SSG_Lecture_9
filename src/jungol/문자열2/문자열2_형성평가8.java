package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_형성평가8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String s = sc.next();
            if (s.equals("END")) {
                break;
            }
            StringBuffer sb = new StringBuffer(s);
            sb.reverse();
            System.out.println(sb);
        }
    }
}
