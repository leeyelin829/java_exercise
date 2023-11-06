import java.util.Scanner;
class Calculator{
    double number1;//number1
    double number2;//number2
    public Calculator(double number1, double number2){//숫자 2개를 저장
        this.number1 = number1;
        this.number2 = number2;
    }
    public double plus() {//더하기
        return number1 + number2;
    }
    public double subtract() {//뺴기
        return number1 - number2;
    }

    public double multiply() {//곱하기
        return number1 * number2;
    }

    public double divide() {//나누기
        if (number2 == 0) {//0으로 나눌 때 오류
            System.out.println("0으로는 나눌 수 없습니다.");
            return Double.NaN;
        }
        return number1 / number2;
    }
    public int remain() {//나머지
        if (number2 == 0) {//0으로 나머지 구할 때 오류
            System.out.println("0으로 나머지 연산을 할 수 없습니다.");
            return 0;
        }
        return (int)number1 % (int)number2;
    }
}
public class exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번쨰 숫자:");//첫 번째 숫자 입력
        double number1 = scanner.nextDouble();

        System.out.print("연산자 입력 (+, -, *, /, %): ");//연산자 입력
        char operator = scanner.next().charAt(0);

        System.out.print("두 번쨰 숫자: ");//두 번째 숫자 입력
        double number2 = scanner.nextDouble();

        Calculator calculator = new Calculator(number1, number2);//객체 생성
        double result = 0;//초기화

        switch (operator) {
            case '+'://덧셈의 경우
                result = calculator.plus();
                break;
            case '-'://빼기의 경우
                result = calculator.subtract();
                break;
            case '*'://곱하기의 경우
                result = calculator.multiply();
                break;
            case '/'://나누기의 경우
                result = calculator.divide();
                break;
            case '%'://나머지의 경우
                int moduloResult = calculator.remain();
                System.out.println((int)number1 + " % " + (int)number2 + " = " + moduloResult);
                break;
            default://잘못된 연산자 입력
                System.out.println("유효하지 않은 연산자입니다. +, -, *, /, % 중 하나를 입력하세요");
                break;
        }

        if (operator != '%') {//나머지 연산을 제외한 결과 출력
            System.out.println("결과: " + result);
        }
    }
}