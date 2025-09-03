package java_advanced_01.day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MiniAssignment {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        );

        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("Java");
        stringList.add("C");

        // 1.
        List<Integer> newIntegerList = integerList.stream()
                        .filter(n -> n % 2 == 0).collect(Collectors.toList());

        newIntegerList.forEach(System.out::println);

        // 2.
        integerList.stream()
                .mapToInt(n -> n * n)
                .forEach(System.out::println);

        // 3.
        stringList.stream()
                .distinct().forEach(System.out::println);

        // 4.
        integerList.stream()
                .sorted().forEach(System.out::println);

        // 5.
        int sum = newIntegerList.stream()
                .mapToInt(n -> n)
                .sum();
        System.out.println(sum);

    }
}
