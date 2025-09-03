package java_basic_02.day12.ex03.package2;

import java_basic_02.day12.ex03.package1.A;

public class D extends A {
    public D() {
        super();
    }

    public void method1() {
        this.field = "value";
        this.method();
    }

    public void method2() { // 직접 객체 생성도 사용 불가
//        A a = new A();
//        a.field = "value";
//        a.method();
//        오직 상속 관계로만 접근 가능
    }
}
