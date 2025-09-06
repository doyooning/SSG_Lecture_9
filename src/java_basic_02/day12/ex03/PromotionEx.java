package java_basic_02.day12.ex03;

class A {

}
class B extends A {

}
class C extends A {

}
class D extends B {

}
class E extends C {

}

public class PromotionEx {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        A a1 = b; // 상속관계, b 객체변수에 저장된 주소값은 부모인 A타입의 a1에 담을 수 있음
        A a2 = c;
        A a3 = d;
        A a4 = e;

        B b1 = d;
//        B b2 = e;
        C c1 = e;
//        C c2 = d; -> 자식이 아니면 자동 변환 안 일어남, 즉 나의 부모타입으로만 자동 변환이 된다.
//      상속 관계 아님.



    }
}
