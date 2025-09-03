package java_advanced_01.day18;

class Animal {
    public String eat() {
        return "eat";
    }
}

public class AnonymousClassEx {
    public static void main(String[] args) {
        // 클래스의 정의와 객체화를 동시에 처리하고 일회성 객체로서 사용
        Animal dog = new Animal(){
            @Override
            public String eat() {
                return "강아지가 먹습니다";
            }
        };
    }
}
