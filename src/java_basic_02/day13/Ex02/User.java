package java_basic_02.day13.Ex02;

public class User {
    public static void main(String[] args) {
        InterfaceImpl impl = new InterfaceImpl();

        InterfaceA ia = impl;
        ia.methodA();
        InterfaceB ib = impl;
        ib.methodB();
        InterfaceC ic = impl;
        ic.methodC();
        ic.methodB();
        ic.methodA();

    }
}
