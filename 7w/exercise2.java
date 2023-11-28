//2023245065 소프트웨어학부 이예린
interface Edible {//인터페이스 정의
    void eat();
}

interface Sweetable {//인터페이스 정의
    void sweet();
}


interface Delicious extends Edible, Sweetable {//Delicious 인터페이스 정의한다. Edible와 Sweetable을 통합한다.
}

class Food implements Delicious {//Delicious를 구현하는 클래스 정의
    @Override
    public void eat() {
        System.out.println("Eating...");
    }

    @Override
    public void sweet() {
        System.out.println("It's sweet!");
    }

}

public class exercise2 {//테스트
    public static void main(String[] args) {
        Food food = new Food();//food 객체 생성
        food.eat();//Edible 인터페이스의 메소드 호출
        food.sweet();//sweetable 인터페이스의 메소드 호출
    }
}
