package java_basic_01.day2;

public class tempEx02 {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        int temp = 0;

        temp = x;
        x = y;
        y = temp;

        System.out.printf("x = %d , y = %d , temp = %d \n", x, y, temp);
    }
}
