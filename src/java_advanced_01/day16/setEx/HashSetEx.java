package java_advanced_01.day16.setEx;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<Member>();

        set.add(new Member("신세계", 30));
        set.add(new Member("신세계", 32));
        set.add(new Member("이세계", 30));
        set.add(new Member("이마트", 27));

        int size = set.size();
        System.out.println(size);
        System.out.println(set);
    }
}
