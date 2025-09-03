package java_basic_02.shinsegaeTraining.test.loop_array;

public class JavaBasic7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i <= 3) {
                for (int j = 2; j >= i; j--) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("@");
                }
            } else {
                for (int j = 4; j <= i; j++) {
                    System.out.print(" ");
                }
                for (int j = 3; j >= 2*(i-3)-1; j--) {
                    System.out.print("@");
                }
            }
            System.out.println();
        }
    }
}
