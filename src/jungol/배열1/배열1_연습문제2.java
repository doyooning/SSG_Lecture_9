package jungol.배열1;

public class 배열1_연습문제2 {
    public static void main(String[] args) {
        char[] C = new char[26];

        for (int i = 0; i < 26; i++) {
            C[i] = (char) (i + 65);
        }
        for (int i = 25; i >= 0; i--) {
            System.out.printf("%c ", C[i]);
        }
    }
}
