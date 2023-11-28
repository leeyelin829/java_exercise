//소프트웨어학부 2023245065 이예린
interface Printable {//Printable 인터페이스 정의
    void print();
}

class A4 implements Printable {//A4 클래스 정의
    @Override
    public void print() {
        System.out.println("A4");
    }
}

class B4 implements Printable {//B4 클래스 정의
    @Override
    public void print() {
        System.out.println("B4");
    }
}

class Call {//Call 클래스 정의
    public void invoke(Printable printable) {//Printable를 받아서 해당 객체의 print 메소드 호출
        if (printable instanceof A4) {
            ((A4) printable).print();
        } else if (printable instanceof B4) {
            ((B4) printable).print();
        } else {
            System.out.println("지원하지 않는 용지입니다.");
        }
    }
}

class PrintableTest {//PrintableTest 클래스
    public static void main(String[] args) {
        Printable p = new B4();//B4 객체 생성
        Call c = new Call();
        c.invoke(p);//Call 클래스의 invoke 메소드 호출
    }
}

public class exercise2 {
    public static void main(String[] args) {
        PrintableTest.main(args);
    }
}
