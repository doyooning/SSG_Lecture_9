package java_basic_02.day11.inheritance.abcdef;

public class BB extends AA {
    private int bb = 20;

    public int getBb() {
        return bb;
    }

    public int addBA() {
        return super.getAa() + bb;
    }
}
