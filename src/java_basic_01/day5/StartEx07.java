package java_basic_01.day5;

public class StartEx07 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            if (i <= 5) {
                for (int j = 4; j >= i; j--) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j <= i-5; j++) {
                    System.out.print(" ");
                }
                for (int j = 9-2*(i-5); j >= 1; j--) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
