package jungol.반복제어문3;

public class 반복제어문3_연습문제5_1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5-i; j >= 1; j--) { // 앞에 넣을 공백
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                // 별 찍기 : 1-3-5-7-9개
                // i : 1-2-3-4-5니깐 별은 2*i-1개 찍기
                System.out.print("*");
            }
            for (int j = 5-i; j >= 1; j--) { // 뒤에 넣을 공백
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
