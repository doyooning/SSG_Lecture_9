package java_basic_01.day5;

public class WhileEx02 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 1;
        while (true) {
            sum += count;
            count++;
            if (count > 100) {
                break;
            }
        }
        System.out.println(sum);
    }
}
