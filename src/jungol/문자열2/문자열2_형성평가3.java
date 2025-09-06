package jungol.문자열2;

import java.util.Scanner;

public class 문자열2_형성평가3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] S = new String[51];
        int count = 1;

        while (true) {
            String str = sc.nextLine();

            if (str.equals("0")) {
                break;
            }

            S[count] = str;
            count++;

        }
        System.out.println(count-1);
        for (int i = 1; i < count; i++) {
            if ((i % 2 == 1) && (S[i] != null)) {
                System.out.println(S[i]);
            }
        }
    }
}
