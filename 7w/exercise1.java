//2023245065 소프트웨어학부 이예린
abstract class Abstract {//추상 클래스 정의
    int i;//필드
    abstract void show();//추상 메소드

    Abstract(int i) {//추상 클래스 생성자
        this.i = i;
    }
}

class Concrete extends Abstract {//구현 클래스 정의
    int j;//추가 필드

    void show() {//구현 메소드
        System.out.println("i = " + i + ", j = " + j);
    }

    Concrete(int i, int j) {// 구현 클래스 생성자
        super(i); //부모 클래스의 생성자 호출
        this.j = j;
    }
}

class AbstractTest {//테스트
    public static void main(String[] args) {
        Concrete c = new Concrete(100, 50);
        c.show(); //메소드 호출
    }
}
public class exercise1 {
    public static void main(String[] args) {
        AbstractTest.main(args);
    }
}