package java_basic_02.day13;

public class User1 {
    public static void main(String[] args) {
        Service service = new ServiceImpl2();

        service.defaultMethod1();
        service.defaultMethod2();

        Service.staticMethod1();
        Service.staticMethod2();

    }
}
