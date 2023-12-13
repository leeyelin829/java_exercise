// Car 클래스 생성
class Car {
    // 필드 선언
    String company;
    String model;
    String color;
    int maxSpeed;
    int speed;

    // 생성자를 통한 초기화
    public Car(String company, String model, String color, int maxSpeed) {
        this.company = company;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.speed = 0; // 초기 속도를 0으로 설정
    }

    // 필드값 출력 메소드
    public void displayCarInfo() {
        System.out.println("Company: " + company);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Current Speed: " + speed + " km/h");
    }

    // 속도 변경 메소드
    public void setSpeed(int newSpeed) {
        if (newSpeed <= maxSpeed) {
            this.speed = newSpeed;
            System.out.println("Speed set to: " + newSpeed + " km/h");
        } else {
            System.out.println("Exceeded Max Speed!");
        }
    }
}

// CarExample 클래스 생성
public class CH05_01 {
    public static void main(String[] args) {
        // Car 클래스의 객체 생성 및 초기화
        Car myCar = new Car("현대자동차", "그렌저", "검정", 250);

        // 초기 필드값 출력
        System.out.println("=== Initial Car Information ===");
        myCar.displayCarInfo();

        // 속도 변경 후 출력
        myCar.setSpeed(60);
        System.out.println("\n=== Updated Car Information ===");
        myCar.displayCarInfo();
    }
}
