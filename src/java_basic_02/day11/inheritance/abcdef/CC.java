package java_basic_02.day11.inheritance.abcdef;

public class CC extends AA{
    private int cc = 30;

    public int getCc() {
        return cc;
    }

    public int addCA() {
        return super.getAa() + cc;
    }
}
