package java_advanced_01.day20;

import java.util.Optional;

class Person{
    private Phone phoneNumber;  //객체 생성시 초기화
    private String name;

    Person(String name){ this.name=name;    }

    public Phone getPhone() {
        return this.phoneNumber;}
}


class Phone{
    private OS os;

    public OS getOs() {
        return this.os;
    }
}

class OS {
    public String printOS(){
        return "IOS";
    }
}

public class Test01 {
    public static void main(String[] args) {
        Person person = new Person("홍길동");
//        person.getPhone().getOs().printOS();
        // Null Object Pattern
        Phone phone = person.getPhone();
        if(phone != null){
            OS os = phone.getOs();
            if(os != null){
                String osName = System.getProperty("os.name").toLowerCase();
            }
        }
    }
    // Optional 클래스 NPE 처리 => Null을 처리하기 위한 랩퍼 클래스

}