import java.util.Scanner;

class Car {
    String company;
    String model;
    String color;
    static int numOfCars = 0;
    static int numOfRedCars = 0;

    public Car(String company, String model, String color) {
        this.company = company;
        this.model = model;
        this.color = color;
        numOfCars++;

        if (color.equals("red")) {//문자열 비교
            numOfRedCars++;
        }
    }
}

class CarTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("몇 개의 자동차를 입력하실건가요?: ");
        int n = sc.nextInt();//n 입력
        sc.nextLine();//개행 문자 처리

        Car[] cars = new Car[n];//n개의 자동차 객체를 저장할 배열

        for (int i = 0; i < n; i++) {//n개 만큼 반복
            System.out.println("자동차 " + (i + 1));//자동차 번호
            System.out.print("제조사: ");//제조사 입력
            String company = sc.nextLine();
            System.out.print("모델명: ");//모델명 입력
            String model = sc.nextLine();
            System.out.print("색상: ");//색상 입력
            String color = sc.nextLine();

            cars[i] = new Car(company, model, color);
        }
        System.out.println("생성된 자동차의 수: " + Car.numOfCars + " 대");//자동차의 수 출력
        System.out.println("빨간색 자동차의 수: " + Car.numOfRedCars + " 대");//빨간색 자동차의 수 입력
    }
}

public class exercise2 {
    public static void main(String[] args) {

    }
}
