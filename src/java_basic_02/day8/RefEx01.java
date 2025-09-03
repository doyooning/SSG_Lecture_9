package java_basic_02.day8;

public class RefEx01 {
    public static void main(String[] args) {
        String refVar1 = null;
        String refVar2 = null;

        refVar1 = new String("자바");
        refVar2 = "프로그램";
        String refVar3 = "자바";
        String refVar4 = null;

        System.out.println(refVar1 == refVar2);
        System.out.println(refVar2 == refVar3);
        System.out.println(refVar1 == refVar3); // false
        System.out.println("----------------");
        System.out.println(refVar1.equals(refVar3)); // true
        System.out.println(refVar2.equals(refVar3));

        System.out.println("NullPointerException 발생");
        System.out.println(refVar4);
        // 아직 인스턴스화되지 않은 상태
        System.out.println(refVar3.length());
    }
}
