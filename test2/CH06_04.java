// Bank 클래스 정의
class Bank {
    public double getInterestRate() {
        // 일반적인 은행의 이자율을 반환 (하위 클래스에서 오버라이딩될 예정)
        return 0.0;
    }
}

// BadBank 클래스 정의 (Bank 클래스 상속)
class BadBank extends Bank {
    // 오버라이딩된 메서드에서 BadBank의 이자율 반환
    @Override
    public double getInterestRate() {
        return 0.1; // 10%
    }
}

// NormalBank 클래스 정의 (Bank 클래스 상속)
class NormalBank extends Bank {
    // 오버라이딩된 메서드에서 NormalBank의 이자율 반환
    @Override
    public double getInterestRate() {
        return 0.05; // 5%
    }
}

// GoodBank 클래스 정의 (Bank 클래스 상속)
class GoodBank extends Bank {
    // 오버라이딩된 메서드에서 GoodBank의 이자율 반환
    @Override
    public double getInterestRate() {
        return 0.03; // 3%
    }
}

// Main 클래스 정의
public class CH06_04 {
    public static void main(String[] args) {
        // 각각의 은행 객체 생성
        BadBank badBank = new BadBank();
        NormalBank normalBank = new NormalBank();
        GoodBank goodBank = new GoodBank();

        // 각 은행의 이자율 출력
        System.out.println("BadBank Interest Rate: " + badBank.getInterestRate());
        System.out.println("NormalBank Interest Rate: " + normalBank.getInterestRate());
        System.out.println("GoodBank Interest Rate: " + goodBank.getInterestRate());
    }
}
