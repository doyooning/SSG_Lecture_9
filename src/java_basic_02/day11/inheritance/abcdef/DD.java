package java_basic_02.day11.inheritance.abcdef;

public class DD extends BB {
    private int dd = 40;

    public int getDd() {
        return dd;
    }

    public int addDB() {
        return super.getBb() + dd;
    }

    public int addDA() {
        return super.getAa() + dd;
    }
}
