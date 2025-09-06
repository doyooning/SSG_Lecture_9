package java_basic_02.day8;

public class RefEx02 {
    public static void main(String[] args) {
        String a = "Hello";
        System.out.println(a.hashCode());

        a += " Java Programming";
        System.out.println(a.hashCode());
        System.out.println(a);
        // -> 수식상으로는 더했지만 새로운 String을 대입함. String은 불변한다
    }
}
