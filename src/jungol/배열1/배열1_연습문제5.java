package jungol.배열1;

import java.time.LocalDate;
import java.util.Scanner;

public class 배열1_연습문제5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[12];
        // 2020년은 2월이 29일까지?
        // 2021년은 2월이 28일까지
        // 2024년은 2월이 29일까지

        while (true) {
            System.out.print("YEAR = ");
            int y = sc.nextInt();
            System.out.print("MONTH = ");
            int m = sc.nextInt();
            if ((y == 0) && (m == 0)) {
                break;
            }
            if ((m >= 1) && (m <= 12)) {
                LocalDate localDate = LocalDate.of(y, m, 1);
                System.out.printf("입력하신 달의 날 수는 %d일입니다.\n", localDate.lengthOfMonth());
            } else {
                System.out.println("잘못 입력하였습니다.");
            }

        }
    }
}
