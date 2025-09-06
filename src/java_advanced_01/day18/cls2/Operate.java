package java_advanced_01.day18.cls2;

public interface Operate {
    // 추상
    int operate(int a, int b);

    // default method
    default void print() {
        System.out.println("print");
    }
}
