package jungol.배열1;

import java.util.Scanner;

public class 배열1_형성평가6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] C = new char[]{'J', 'U', 'N', 'G', 'O', 'L'};
        boolean state = false;

        char a = sc.next().charAt(0);

        for (int i = 0; i < 6; i++) {
            if (a == C[i]) {
                System.out.print(i);
                state = true;
            }
        }
        if (!state) {
            System.out.print("none");
        }
    }
}
