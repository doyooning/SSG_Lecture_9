package java_basic_02.day11.inheritanceTest.test1;

public class Alcohol extends Drink {
    double alcper;

    public Alcohol(String name, int price, int count, double alcper) {
        super(name, price, count);
        this.alcper = alcper;
    }

    public static void printTitle() {
        System.out.println("상품명(도수[%])\t 단가\t 수량\t 금액\t");
    }

    @Override
    public void printData() {
        System.out.printf("%s(%.1f)%12d%5d%12d%n", name, alcper, price, count, price * count);
    }
}
