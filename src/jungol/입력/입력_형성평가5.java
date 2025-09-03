package jungol.입력;

import java.util.Scanner;

public class 입력_형성평가5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("yard? ");
        double a = sc.nextDouble();
        double cm = a * 91.44f;
        System.out.printf("%.1fyard = %.1fcm", a, cm);
    }
}
