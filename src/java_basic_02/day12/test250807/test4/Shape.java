package java_basic_02.day12.test250807.test4;

public abstract class Shape {
    protected double area;
    private String name;

    public Shape() {

    }

    public Shape(String name) {
        this.name = name;
    }

    public abstract void calculationArea();

    public void print() {
        String d;
        if (name.equals("원")) {
            d = String.format("%.13f", area);
        } else {
            d = String.format("%.1f", area);
        }
        System.out.printf("%s의 면적은 %s\n", name, d);

    }
}
