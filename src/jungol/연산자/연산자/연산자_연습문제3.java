package 연산자;

public class 연산자_연습문제3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        System.out.printf("최초값 a = %d, b = %d\n", a, b);
        ++b;
        System.out.printf("a++ = %d, ++b = %d\n", a, b);
        a++;
        System.out.printf("실행후 a = %d, b = %d\n", a, b);
        --b;
        System.out.printf("a-- = %d, --b = %d\n", a, b);
        --a;
        System.out.printf("실행후 a = %d, b = %d\n", a, b);
    }
}
