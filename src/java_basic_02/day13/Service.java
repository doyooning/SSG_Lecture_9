package java_basic_02.day13;

public interface Service {
    // default
    default void defaultMethod1() {
        System.out.println("defaultMethod1");
        defaultCommon();
    }

    default void defaultMethod2() {
        System.out.println("defaultMethod2");
        defaultCommon();
    }

    // private
    private void defaultCommon() {
        System.out.println("defaultMethod 중복코드 A");
        System.out.println("defaultMethod 중복코드 B");
    }

    // static
    static void staticMethod1() {
        System.out.println("staticMethod1 코드");
        staticCommon();
    }

    static void staticMethod2() {
        System.out.println("staticMethod2 코드");
        staticCommon();
    }

    // private static
    private static void staticCommon() {
        System.out.println("staticMethod 중복코드 A");
        System.out.println("staticMethod 중복코드 B");
    }

}
