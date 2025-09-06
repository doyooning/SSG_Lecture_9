package jungol.반복제어문3;

public class 반복제어문3_연습문제3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            if (i <= 3) { // i = 3까지만 오름차순으로 별찍기
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            } else { // i = 4부터는 내림차순으로 별찍기
                for (int j = 6; j >= i; j--) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
