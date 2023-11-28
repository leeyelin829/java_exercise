//소프트웨어학부 2023245065 이예린
abstract class Controller {// Controller 추상 클래스 정의
    protected boolean power;
    public Controller(boolean power) {// 생성자
        this.power = power;
    }

    abstract void show();//추상 메소드
}

class TV extends Controller {//TV 클래스 정의
    public TV(boolean power) {//생성자
        super(power);
    }

    @Override
    void show() {//추상 메소드 구현
        if (power) {
            System.out.println("TV가 켜졌습니다.");
        } else {
            System.out.println("TV가 꺼졌습니다.");
        }
    }
}

class Radio extends Controller {//Radio 클래스 정의
    public Radio(boolean power) {//생성자
        super(power);
    }

    @Override
    void show() {//추상 메소드 구현
        if (power) {
            System.out.println("라디오가 켜졌습니다.");
        } else {
            System.out.println("라디오가 꺼졌습니다.");
        }
    }
}

class ControllerTest {//ControllerTest 클래스
    public static void main(String[] args) {
        Controller[] controllers = {new TV(false), new Radio(true)};//Controller 배열 생성

        for (Controller controller : controllers) {//각 Controller의 show 메소드 호출
            controller.show();
        }
    }
}

public class exercise1 {
    public static void main(String[] args) {
        ControllerTest.main(args);
    }
}
