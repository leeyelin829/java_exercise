//2023245065 소프트웨어학부 이예린
interface Talkable {//Talkable 인터페이스 정의
    void talk();
}

class Korean implements Talkable {//Korean 클래스 정의
    @Override
    public void talk() {
        System.out.println("안녕하세요!");
    }
}

class American implements Talkable {//American 클래스 정의 (Talkable 인터페이스 구현)
    @Override
    public void talk() {
        System.out.println("Hello!");
    }
}

class TalkableTest {//테스트
    static void speak(Talkable talker) {//speak 메소드 정의
        talker.talk();
    }

    public static void main(String[] args) {
        //Korean과 American 객체 생성
        speak(new Korean());
        speak(new American());
    }
}
public class exercise4 {
    public static void main(String[] args) {
        TalkableTest.main(args);
    }
}