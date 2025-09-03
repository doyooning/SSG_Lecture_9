package jungol.배열1;

import java.util.Scanner;

public class 배열1_연습문제3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] N = new int[3];
        for (int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            switch(i) {
                case 2:
                    N[0] = a;
                    break;
                case 4:
                    N[1] = a;
                    break;
                case 9:
                    N[2] = a;
                    break;
            }

        }
        for (int i : N) {
            System.out.print(i + " ");
        }
    }
}
