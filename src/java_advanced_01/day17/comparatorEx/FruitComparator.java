package java_advanced_01.day17.comparatorEx;

import java.util.Comparator;

public class FruitComparator implements Comparator<Fruits> {

    @Override
    public int compare(Fruits o1, Fruits o2) {
        if (o1.price == o2.price) {
            return 0;
        } else if (o1.price > o2.price) {
            return 1;
        }
        return -1;
    }
}
