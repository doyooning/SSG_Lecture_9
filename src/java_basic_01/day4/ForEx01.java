package java_basic_01.day4;

import java.util.Scanner;

public class ForEx01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("몇 번 반복할까요?");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println(i + "번째");
        }
    }
}
