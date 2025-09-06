package java_basic_02.day11.inheritance.abcdef;

public class EE extends BB {
    private int ee = 50;

    public int getEe() {
        return ee;
    }

    public int addEB() {
        return super.getBb() + ee;
    }

    public int addEA() {
        return super.getAa() + ee;
    }
}
