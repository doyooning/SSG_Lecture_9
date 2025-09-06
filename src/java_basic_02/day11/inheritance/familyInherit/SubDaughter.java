package java_basic_02.day11.inheritance.familyInherit;

public class SubDaughter extends SubFather {

    void printDaughter() {
        System.out.printf("나는 딸입니다.\n나는 아버지로부터 상속받습니다.\n나의 아버지는 %s\n나의 집은 %s", familyName, houseAddress);
    }

    public static void main(String[] args) {
        SubDaughter objDaughter = new SubDaughter();

        objDaughter.printDaughter();
        objDaughter.printFather();
    }
}
