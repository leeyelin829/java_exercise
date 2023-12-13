// Shape 클래스 정의
class Shape {
    public Shape() {
        System.out.println("Shape 클래스의 생성자 호출");
    }
}

// Rectangle 클래스 정의 (Shape 클래스 상속)
class Rectangle extends Shape {
    public Rectangle() {
        super(); // 부모 클래스의 생성자 호출
        System.out.println("Rectangle 클래스의 생성자 호출");
    }
}

// ColoredRectangle 클래스 정의 (Rectangle 클래스 상속)
class ColoredRectangle extends Rectangle {
    public ColoredRectangle() {
        super(); // 부모 클래스의 생성자 호출
        System.out.println("ColoredRectangle 클래스의 생성자 호출");
    }
}

// Main 클래스 정의
public class CH06_05 {
    public static void main(String[] args) {
        // ColoredRectangle 객체 생성
        ColoredRectangle coloredRectangle = new ColoredRectangle();
    }
}
