package jungol.입력;

public class 입력_연습문제4 {
    public static void main(String[] args) {
        int r = 5;
        int d = 2;
        float p = 3.140000f;
        float rdp = 31.400000f;
        float asdf = 78.500000f;

        System.out.printf("원주 = %d * %d * %.6f = %.6f\n", r, d, p, rdp);
        System.out.printf("넓이 = %d * %d * %.6f = %.6f", r, r, p, asdf);
    }
}
