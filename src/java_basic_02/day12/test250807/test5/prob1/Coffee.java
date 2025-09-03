package java_basic_02.day12.test250807.test5.prob1;

public class Coffee extends Beverage {
    static int amount;

    public Coffee(String name) {
        super(name);
        calcPrice();
        amount++;
    }

    @Override
    public void calcPrice() {
        switch (getName()) {
            case "Americano" -> {
                setPrice(1500);
            }
            case "CafeLatte" -> {
                setPrice(2500);
            }
            case "Cappuccino" -> {
                setPrice(3000);
            }
        }
    }
}
