package java_basic_02.day12.ex03;

public class ChildEx {
    public static void main(String[] args) {

        Parent parent = new Child();

        parent.field1 = "aaaa";
        parent.method1();
        parent.method2();

        Child child = (Child) parent;
        child.field2 = "asdf";
        child.method3();
    }
}
