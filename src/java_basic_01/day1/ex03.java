package java_basic_01.day1;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = b + 100 - a;
        System.out.println(c);
        if (c > 0) {
            System.out.println("Obesity");
        }
    }
}
