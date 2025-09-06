package jungol.반복제어문3;

public class 반복제어문3_연습문제7 {
    public static void main(String[] args) {
        int numCount = 1;
        int charCount = 97; // a = 97

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) { // 오름차순 1-2-3-4
                System.out.printf("%c ", (char)charCount);
                charCount++;
            }

            for (int j = 4; j >= i; j--) { // 내림차순 4 3 2 1
                System.out.printf("%d ", numCount);
                numCount++;
            }
            System.out.println();
        }
    }
}
