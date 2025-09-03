package jungol.반복제어문2;

import java.util.Scanner;
import java.util.stream.IntStream;

public class 반복제어문2_형성평가3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;

        IntStream intStream = IntStream.rangeClosed(1, a);
        sum = intStream.filter(i -> i%5 == 0).sum();
        System.out.println(sum);
    }
}
