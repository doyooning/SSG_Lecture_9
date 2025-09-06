package java_advanced_01.day14.exceptionEx;

public class RuntimeErrorEx {
    public static void main(String[] args) {
        String str = "3.1415928268";
//        System.out.println(Integer.parseInt(str)); // NumberFormatException
        float num = Float.parseFloat(str); // 문자열 -> 실수형으로 바꿔주어야 함
        System.out.println(num);

        /*Integer i = 30;
        Object x = i;
        System.out.println((String) x);*/ // ClassCastException

           }
}
