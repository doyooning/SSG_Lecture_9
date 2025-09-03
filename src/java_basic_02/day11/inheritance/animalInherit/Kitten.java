package java_basic_02.day11.inheritance.animalInherit;

public class Kitten extends Cat {
    void meow2() {
        System.out.println("새기 고양이가 야옹하고 울다.");
    }

    public static void main(String[] args) {
        Kitten objKitten = new Kitten();

        objKitten.meow2();
        objKitten.meow();
        objKitten.eat();
    }
}
