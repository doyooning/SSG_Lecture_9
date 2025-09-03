package java_basic_01.day5;

public class ContinueEx01 {
    public static void main(String[] args) {
        // Continue는 반복문인 for, while, do-while 에서만 사용한다.
        // 블록 내부에서 continue문이 사용되면 for의 증감식, while문, do-while문의 조건식으로 바로 이동

        // Continue문은 반복문을 종료시키지 않는다
        for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
            if (i % 2 != 0) {
                continue;
            }
            System.out.println("결과출력: " + i); // 짝수만
        }
    }
}
