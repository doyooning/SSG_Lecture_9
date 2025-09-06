package java_basic_02.day9;

public class MethodsEx02 {
    public static void main(String[] args) {
        String greeting = greeting();
        System.out.println(greeting);
        System.out.println(greeting + " Java");
        System.out.println(greeting() + " Java Programming");
    }

    public static String greeting() {
        String greeting = "Hello";
        return greeting;
    }
}
