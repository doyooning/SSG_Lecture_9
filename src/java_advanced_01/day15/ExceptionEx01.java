package java_advanced_01.day15;

public class ExceptionEx01 {
    public static void main(String[] args) {
        try {
            String[] array = {"100", "lOO"};
        } catch (ArrayIndexOutOfBoundsException e) {
            e.getMessage();
        } catch (NumberFormatException nfe) {
            nfe.getMessage();
        }
    }
}
