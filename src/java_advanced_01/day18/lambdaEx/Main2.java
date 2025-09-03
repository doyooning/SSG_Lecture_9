package java_advanced_01.day18.lambdaEx;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Jack", "Jill", "Bob");
        List<String> filteredNames = names.stream().filter(name -> name.startsWith("J")).toList();
        System.out.println(filteredNames);

        UnaryOperator<Integer> square = x -> x * x;
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        Runnable run = () -> System.out.println("Hello World!");
    }
}
