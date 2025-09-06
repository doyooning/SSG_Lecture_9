package java_advanced_01.day18;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        class User {
            private String name;
            private int age;

            public User(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public String getName() {
                return name;
            }

            public int getAge() {
                return age;
            }
        }
        User[] users = new User[]{
                new User("John", 20),
                new User("Jane", 30),
                new User("Jack", 40),
                new User("Jill", 50),
        };
        System.out.println("--------나이 순 오름차순---------");
        Arrays.sort(users, Comparator.comparing(User::getAge));
        for (User user : users) {
            System.out.println(user.getName() + " " + user.getAge() + "세");
        }

        System.out.println("--------이름 순 오름차순---------");
        Arrays.sort(users, Comparator.comparing(User::getName));
        for (User user : users) {
            System.out.println(user.getName() + " " + user.getAge() + "세");
        }

        System.out.println();
        Arrays.sort(users, Comparator.comparing(User::getAge).thenComparing(User::getName));
        for (User user : users) {
            System.out.println(user.getName() + " " + user.getAge() + "세");
        }

    }
}
