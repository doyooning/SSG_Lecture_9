package java_basic_01.day4;

import java.util.Scanner;

public class SwitchEx02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A, B, C 중 점수를 입력하세요. ");
        char c = sc.next().charAt(0);

        switch(c) {
            case 'A':
                System.out.println("매우 우수");
                break;
            case 'B':
                System.out.println("우수");
                break;
            case 'C':
                System.out.println("노력하세요");
                break;
            default:
                System.out.println("잘못된 점수입니다.");
        }
    }
}
