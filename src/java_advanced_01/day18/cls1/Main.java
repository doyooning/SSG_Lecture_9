package java_advanced_01.day18.cls1;

class Animal {
    public String eat() {
        return "맛있당";
    }
}


public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal() {
            @Override
            public String eat() {
                return "멍" + run(); // 멍뛰
            }

            public String run() {
                return "뛰";
            }
        };
        System.out.println(dog.eat());
        // dog.run(); -> run()은 더 이상 존재하지 않음
    }
}
