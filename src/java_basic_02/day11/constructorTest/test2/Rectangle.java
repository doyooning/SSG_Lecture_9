package java_basic_02.day11.constructorTest.test2;

public class Rectangle {
    private int width;
    private int length;
    private String color;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int area() {
        return width * length;
    }

    public int perimeter() {
        return 2 * (width + length);
    }
}
