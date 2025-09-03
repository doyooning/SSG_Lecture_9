package java_basic_02.day11.inheritance.abcdef;

public class InheritanceMain {
    public static void main(String[] args) {
        DD dd = new DD();
        EE ee = new EE();
        FF ff = new FF();

        System.out.println(dd.addBA());
        System.out.println(dd.addDB());
        System.out.println(dd.addDA());

        System.out.println(ee.addBA());
        System.out.println(ee.addEB());
        System.out.println(ee.addEA());

        System.out.println(ff.addCA());
        System.out.println(ff.addFC());
        System.out.println(ff.addFA());
    }
}
