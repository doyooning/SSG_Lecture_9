package java_basic_01.day2;

public class StringEx {
    public static void main(String[] args) {
        String name = "신세계";
        String job = "프로그래머";

        System.out.println(name + " 과장의 직무는 " + job + "입니다.");

        String str = "나는 \"자바\"를 배우고 있습니다.";
        System.out.println(str);

        //java14부터 지원되는 따옴표 3개

        String str3 = """
                    
                    "id":"spring",
                    "name":"molla"
                                                     """;
        System.out.println(str3);

    }
}
