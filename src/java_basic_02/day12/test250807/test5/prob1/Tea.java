package java_basic_02.day12.test250807.test5.prob1;

public class Tea extends Beverage {
    static int amount;

    public Tea(String name) {
        super(name);
        calcPrice();
        amount++;
    }

    @Override
    public void calcPrice() {
        switch (getName()) {
            case "lemonTea" -> {
                setPrice(1500);
            }
            case "ginsengTea" -> {
                setPrice(2000);
            }
            case "redginsengTea" -> {
                setPrice(2500);
            }
        }
    }
}
