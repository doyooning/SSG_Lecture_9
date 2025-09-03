package java_basic_02.day11.inheritance.familyInherit;

public class SubSon extends SubFather {

    void printSon() {
        System.out.printf("나는 아들입니다.\n나는 아버지로부터 상속받습니다.\n나의 아버지는 %s\n나의 집은 %s", familyName, houseAddress);
    }

    public static void main(String[] args) {
        SubSon objSon = new SubSon();

        objSon.printSon();
        objSon.printFather();
    }
}
