package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_형성평가5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] S = new String[5];
        boolean status = false;

        for (int i = 0; i < 5; i++) {
            String str = sc.nextLine();
            S[i] = str;
        }

        char c = sc.next().charAt(0);
        String a = sc.next();

        for (String s : S) {
            if ((s.contains(String.format("%c", c))) || (s.contains(a))) {
                System.out.println(s);
                status = true;
            }
        }
        if (!status) {
            System.out.println("none");
        }
    }
}
