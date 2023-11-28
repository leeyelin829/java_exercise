//소프트웨어학부 2023245065 이예린
interface Human {//Human 인터페이스 정의
    void eat();

    static void echo() {//echo 메소드
        System.out.println("인간입니다.");
    }
}

class Worker implements Human {//Worker 클래스 정의
    @Override
    public void eat() {
        System.out.println("빵을 먹습니다.");
    }
}

class Student implements Human {//Student 클래스 정의 (Human을 구현)
    private int age;

    public Student(int age) {//생성자
        this.age = age;
    }

    public void print() {//print 메소드 구현
        System.out.println("야호!!!");
        System.out.println(age + "세의 학생입니다.");
    }

    @Override
    public void eat() {
        System.out.println("도시락을 먹습니다.");
    }
}

class HumanTest {//HumanTest 생성
    public static void main(String[] args) {//HumanTest 프로그램
        Student student = new Student(20);//Student 클래스 인스턴스 생성
        student.print();
        student.eat();

        Human.echo();//Human 인터페이스 static 메소드 호출

        Human worker = new Worker();//Worker 클래스 인스턴스 생성
        worker.eat();
    }
}

public class exercise3 {
    public static void main(String[] args) {
        HumanTest.main(args);
    }
}
