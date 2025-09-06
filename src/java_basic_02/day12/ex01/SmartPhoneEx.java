package java_basic_02.day12.ex01;

public class SmartPhoneEx {
    public static void main(String[] args) {
        SmartPhone myPhone1 = new SmartPhone("갤럭시24", "화이트");
        SmartPhone myPhone2 = new SmartPhone("갤럭시24", "블랙");

        System.out.println(myPhone1.model + " " + myPhone1.color + " " + myPhone1.wifi);
        System.out.println(myPhone2.model + " " + myPhone2.color + " " + myPhone2.wifi);

        System.out.println("와이파이 상태 체크 :" + myPhone2.wifi);
        myPhone2.setWifi(true);
        System.out.println("와이파이 상태 체크 :" + myPhone2.wifi);

        myPhone2.bell();
        myPhone2.hangUp();
        myPhone2.receiveVoice("안녕하세요 . 동민이 좀 바꿔주세요"); //예?
        myPhone2.sendVoice("어...잠깐만...."); //예...?
        myPhone2.hangUp();
        myPhone2.internet();
    }
}
