package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_형성평가7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        char[] aC = a.toCharArray();
        char[] bC = b.toCharArray();
        String A = "";
        String B = "";

        for (int i = 0; i < aC.length; i++) {
            if ((aC[i] - 48 < 0) || (aC[i] - 48 > 9)) {
                break;
            }
            A += String.valueOf(aC[i]);
        }

        for (int i = 0; i < bC.length; i++) {
            if ((bC[i] - 48 < 0) || (bC[i] - 48 > 9)) {
                break;
            }
            B += String.valueOf(bC[i]);
        }

        int aI = Integer.parseInt(A);
        int bI = Integer.parseInt(B);

        System.out.println(aI * bI);
    }
}
