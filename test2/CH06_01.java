// Animal 클래스 정의
class Animal {
    String picture;
    double weight;

    public void eat() {
        System.out.println("eat()가 호출되었음");
    }

    public void sleep() {
        System.out.println("sleep()가 호출되었음");
    }
}

// Lion 클래스 정의 (Animal 클래스 상속)
class Lion extends Animal {
    int legs;

    public void roar() {
        System.out.println("roar()가 호출되었음");
    }

    // eat 메서드 오버라이드
    @Override
    public void eat() {
        super.eat(); // 부모 클래스의 eat 메서드 호출
    }

    // sleep 메서드 오버라이드
    @Override
    public void sleep() {
        super.sleep(); // 부모 클래스의 sleep 메서드 호출
    }
}

// Eagle 클래스 정의 (Animal 클래스 상속)
class Eagle extends Animal {
    int wings;

    public void fly() {
        System.out.println("fly()가 호출되었음");
    }

    // eat 메서드 오버라이드
    @Override
    public void eat() {
        super.eat(); // 부모 클래스의 eat 메서드 호출
    }

    // sleep 메서드 오버라이드
    @Override
    public void sleep() {
        super.sleep(); // 부모 클래스의 sleep 메서드 호출
    }
}

// Practice 클래스 정의
public class CH06_01 {
    public static void main(String[] args) {
        // Lion 객체 생성
        Lion lion = new Lion();
        lion.eat();
        lion.sleep();
        lion.roar();

        System.out.println(); // 공백 줄 추가

        // Eagle 객체 생성
        Eagle eagle = new Eagle();
        eagle.eat();
        eagle.sleep();
        eagle.fly();
    }
}
