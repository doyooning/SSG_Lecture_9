package java_advanced_01.day18;

import java.util.Comparator;

public class UserComparator implements Comparator<UserComparator> {

    public String name;
    public int age;

    public UserComparator(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compare(UserComparator o1, UserComparator o2) {
        if (o1.age < o2.age) {
            return -1;
        } else if (o1.age > o2.age) {
            return 1;
        }
        return 0;
    }
}
