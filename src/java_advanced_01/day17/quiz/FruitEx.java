package java_advanced_01.day17.quiz;

import java.util.TreeSet;

public class FruitEx {
    public static void main(String[] args) {

        Fruit apple = new Fruit("사과", 10000);
        Fruit tangerine = new Fruit("귤", 12000);
        Fruit peach = new Fruit("복숭아", 8000);
        Fruit grape = new Fruit("포도", 18000);

        TreeSet<Fruit> chongGakStore = new TreeSet<>();
        chongGakStore.add(apple);
        chongGakStore.add(tangerine);
        chongGakStore.add(peach);
        chongGakStore.add(grape);

        for (Fruit f : chongGakStore) {
            System.out.println(f.name + " : " + f.price);
        }

    }
}
