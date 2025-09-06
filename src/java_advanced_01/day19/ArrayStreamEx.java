package java_advanced_01.day19;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayStreamEx {
    public static void main(String[] args) {
        String[] strings = new String[]{"1", "2", "3", "4", "5"};
        Stream<String> stream = Arrays.stream(strings);
        stream.forEach(item -> System.out.println(item + " "));

        Integer[] integers = new Integer[]{1, 2, 3, 4, 5};
        Stream<Integer> intStream = Arrays.stream(integers);
        intStream.forEach(item -> System.out.println(item + " "));
    }
}
