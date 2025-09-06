package java_basic_02.shinsegaeTraining.test.loop_array;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaBasic8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 0;

        Contents:
        while (true) {
            System.out.println("----------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("----------------------------------");
            System.out.print("선택> ");
            try {
                int n = sc.nextInt();
                switch (n) {
                    case 1:
                        System.out.print("예금액> ");
                        int deposit = sc.nextInt();
                        balance += deposit;
                        break;
                    case 2:
                        System.out.print("출금액> ");
                        int withdraw = sc.nextInt();
                        if (balance < withdraw) {
                            System.out.println("승인 거절 -- 잔액이 부족합니다.");
                        } else {
                            balance -= withdraw;
                        }
                        break;
                    case 3:
                        System.out.printf("잔고> %d\n", balance);
                        break;
                    case 4:
                        System.out.println("프로그램이 종료됩니다.");
                        break Contents;
                    default:
                        System.out.println("유효한 숫자를 입력해주십시오.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력해주십시오.");
                sc.nextLine();
            }
        }
    }
}
