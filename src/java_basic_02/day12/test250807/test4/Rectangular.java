package java_basic_02.day12.test250807.test4;

public class Rectangular extends Shape {
    private double width;
    private String height;

    public Rectangular(String name, double width, int height) {
        super(name);
        this.width = width;
        this.height = String.valueOf(height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Override
    public void calculationArea() {
        area = getWidth() * Integer.parseInt(getHeight());
    }
}
