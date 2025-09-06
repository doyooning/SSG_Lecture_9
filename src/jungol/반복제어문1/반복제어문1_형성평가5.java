package jungol.반복제어문1;

import java.util.Scanner;

public class 반복제어문1_형성평가5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Base = ");
            int b = sc.nextInt();
            System.out.print("Height = ");
            int h = sc.nextInt();
            System.out.printf("Triangle width = %.1f\n", (double)b * h / 2);
            System.out.print("Continue? ");
            char c = sc.next().charAt(0);
            if ((c == 'Y') || (c == 'y')) {
                continue;
            } else {
                break;
            }
        }
    }
}
