package java_advanced_01.day18;

import java.util.Arrays;
import java.util.Comparator;

public class User implements Comparable<User> {

    public String name;
    public int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(User o) {
        if (this.age < o.age) {
            return -1;
        } else if (this.age > o.age) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        User[] users = new User[]{
                new User("박희동", 14),
                new User("홍길동", 32),
                new User("김동성", 48),
                new User("김유신", 64)
        };

        System.out.println("나이 순 오름차순 정렬");
        Arrays.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return Integer.compare(o1.age, o2.age);
                // Integer 클래스에 정의된 compare 함수로 두 정수값을 비교
            }
        });
        // 람다식
        Arrays.sort(users, (u1, u2) -> Integer.compare(u1.age, u2.age));

        System.out.println("이름 순 오름차순 정렬");
        Arrays.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.name.compareTo(o2.name);
                // compareTo()로 이름끼리 비교
            }
        });
        // 람다식
        Arrays.sort(users, (u1, u2) -> u1.name.compareTo(u2.name));

    }
}
