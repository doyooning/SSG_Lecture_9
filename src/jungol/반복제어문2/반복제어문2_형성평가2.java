package jungol.반복제어문2;

import java.util.Scanner;
import java.util.stream.IntStream;

public class 반복제어문2_형성평가2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        IntStream intStream = IntStream.rangeClosed(Math.min(a, b), Math.max(a, b));
        intStream.forEach(n -> System.out.print(n + " "));
    }
}
