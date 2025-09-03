package jungol.반복제어문3;

public class 반복제어문3_연습문제5_2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { // 연습4와 동일하게 작성
            for (int j = 5-i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i-1; j++) {
                // 대신 별 찍기를 추가... 1-2-3-4개
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
