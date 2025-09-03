package java_basic_02.shinsegaeTraining.test.loop_array;

public class JavaBasic3 {
    public static void main(String[] args) {

        while (true) {
            int n1 = (int)(Math.random()*6+1);
            int n2 = (int)(Math.random()*6+1);
            System.out.printf("(%d, %d)\n", n1, n2);
            if (n1 + n2 == 5) {
                break;
            }
        }
    }
}
