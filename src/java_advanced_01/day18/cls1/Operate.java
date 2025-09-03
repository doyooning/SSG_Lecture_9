package java_advanced_01.day18.cls1;

// 연산식을 추상화한 인터페이스
@FunctionalInterface
public interface Operate {
    int operate(int a, int b);
}
