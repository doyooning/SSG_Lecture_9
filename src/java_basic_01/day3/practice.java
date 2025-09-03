package java_basic_01.day3;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = 5000;
        System.out.printf("상품의 가격: %d원\n", price);
        System.out.printf("상품의 가격: %6d원\n", price);
        System.out.printf("상품의 가격: %06d원\n", price);

        System.out.print("반지름을 입력하세요. ");
        int r = sc.nextInt();
        System.out.printf("반지름이 %d인 원의 넓이: %.1f", r, r*r*Math.PI);
    }
}
