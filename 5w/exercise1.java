class Car {//2023245065 소프트웨어학부 이예린
    //필드 선언 및 초기화
    String company = "현대자동차";
    String model = "그랜저";
    String color = "검정";
    int maxSpeed = 350;
    int speed;
}

class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();//Car class의 객체 생성

        System.out.println("자동차 정보:");//Car class의 필드 값 읽기
        System.out.println("제조사: " + myCar.company);
        System.out.println("모델: " + myCar.model);
        System.out.println("색상: " + myCar.color);
        System.out.println("최대 속도: " + myCar.maxSpeed);

        myCar.speed = 120;//Car class의 speed 필드 값 변경
        System.out.println("현재 속도: " + myCar.speed);//변경된 값 출력
    }
}
public class exercise1 {
    public static void main(String[] args) {
        CarExample.main(args);//CarExample의 메인 메서드 호출
    }
}
