package java_basic_02.day12.ex03;

public class Child extends Parent {

    public String field2;

    @Override
    public void method1() {
        System.out.println("자식 method1");
    }

    @Override
    public void method2() {
        System.out.println("자식 method2");
    }

    public void method3() {
        System.out.println("자식 method3");
    }
}
