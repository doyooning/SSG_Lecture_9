package java_advanced_01.day17.comparatorEx;

import java.util.TreeSet;

public class ComparatorEx {
    public static void main(String[] args) {
        // 과일 관리 기준(FruitComparator)으로 정렬하여 관리
        TreeSet<Fruits> fruits = new TreeSet<>(new FruitComparator());
        fruits.add(new Fruits("apple", 10));
        fruits.add(new Fruits("Banana", 5));

        for (Fruits fruit : fruits) {
            System.out.println(fruit.name + " " + fruit.price);
        }
    }
}
