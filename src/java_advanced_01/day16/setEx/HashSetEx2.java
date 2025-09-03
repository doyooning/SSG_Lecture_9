package java_advanced_01.day16.setEx;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx2 {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<Member>();

        set.add(new Member("신세계", 30));
        set.add(new Member("신세계", 30));
        set.add(new Member("신세계", 30));

        // iterator + while로 객체 get
        Iterator<Member> iterator = set.iterator();
        while (iterator.hasNext()) {
            Member member = iterator.next();
            System.out.println(member.name + " " + member.age);
        }
        System.out.println();

        // enhanced for로 객체 get
        for (Member member : set) {
            System.out.println(member.name + " " + member.age);
        }
    }
}
