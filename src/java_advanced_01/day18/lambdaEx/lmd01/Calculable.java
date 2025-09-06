package java_advanced_01.day18.lambdaEx.lmd01;

// 함수형 인터페이스임을 보장(선택사항)
// 컴파일 과정에서 추상메서드가 하나인지를 컴파일러가 검사, 정확한 인터페이스 작성 도움
@FunctionalInterface
public interface Calculable {
    // 추상메서드
    void calculate(int num1, int num2);

}
