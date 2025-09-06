package java_basic_02.day12.ex03.package1;

public class B {

    public void method() {
        A a = new A();
        a.field = "value";
        a.method();
    }

    public static void main(String[] args) {
        B b = new B();
        b.method();

    }
}
