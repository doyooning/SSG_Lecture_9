package java_basic_02.day12.ex03;

public class Shape {
    public static void main(String[] args) {
        // 서로 다른 타입들을 각각 타입을 새로 정의해서 같은 타입끼리 묶어서 관리
        Rectangle[] rectangles = new Rectangle[4];
        Circle[] circles = new Circle[3];
        Triangle[] triangles = new Triangle[5];

        for (int i = 0; i < rectangles.length; i++) {
            rectangles[i] = new Rectangle();
        }

        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle();
        }

        for (int i = 0; i < triangles.length; i++) {
            triangles[i] = new Triangle();
        }

        Shape[] shapes = new Shape[4];
        shapes[0] = rectangles[0];
        shapes[0] = rectangles[1];
        shapes[2] = triangles[2];
        shapes[3] = circles[2];

        Circle circle = (Circle) shapes[3];
    }
}

// 하나의 자료형 Shape로 관리, 코드량 적고 가독성 좋고 유지보수성 굿
// 자식 클래스에서만 있는 고유 메서드 실행하려면 업캐스팅한 객체를 다시 자식 클래스로 다운캐스팅