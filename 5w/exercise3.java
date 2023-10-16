class Circle{//2023245065 소프트웨어학부 이예린
    double radius = 1;//radius 선언
    public Circle(){//radius 값 1로 초기화
        this.radius = 1;
    }
    public Circle(double radius){//매개변수로 radius 값을 받아서 초기화
        this.radius = radius;
    }
    public double getArea(){//원의 넓이를 계산하여 리턴
        return Math.PI * radius * radius;
    }
    public double getCircuference(){//원의 둘레를 계산하여 리턴
        return Math.PI * radius * 2;
    }
    public void SetRadius(double radius){//radius 값을 수정
        this.radius = radius;
    }

}
class TestCircle{
    public static void main(String[] args) {
        Circle C1 = new Circle();//객체 1 생성
        System.out.println("C1");
        System.out.println("원의 넓이:"+C1.getArea());//원의 넓이
        System.out.println("원의 넓이:"+C1.getCircuference());//원의 둘레

        System.out.println("");

        Circle C2 = new Circle(25);//객체 2 생성하고 매개번수 radius = 25로 설정
        System.out.println("C2");
        System.out.println("원의 넓이:"+C2.getArea());//원의 넓이
        System.out.println("원의 넓이:"+C2.getCircuference());//원의 둘레

        System.out.println("");

        Circle C3 = new Circle(125);//객체 3 생성하고 매개변수 radius = 125로 설정
        System.out.println("C3");
        System.out.println("원의 넓이:"+C3.getArea());//원의 넓이
        System.out.println("원의 넓이:"+C3.getCircuference());//원의 둘레

        System.out.println("");

        C1.SetRadius(100);//객체 1의 radius = 100으로 수정
        System.out.println("C1");
        System.out.println("원의 넓이:"+C1.getArea());//원의 넓이
        System.out.println("원의 넓이:"+C1.getCircuference());//원의 둘레
    }
}
public class exercise3 {
    public static void main(String[] args) {
        TestCircle.main(args);//TestCircle의 메인 메서드 호출
    }
}
