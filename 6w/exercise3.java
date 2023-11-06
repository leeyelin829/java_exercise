import java.util.Scanner;

class BMI {
    private String name;
    private int age;
    private double weight;
    private double height;

    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public double getBMI() {
        //키가 5 미만이라면, 키를 m로 입력한 것으로 가정
        if (height < 5) {
            return Math.round((this.weight / (this.height * this.height)) * 10.0) / 10.0;
        } else if (height > 100) {
            //키가 100 이상이라면, 키를 cm로 입력한 것으로 가정
            return Math.round((this.weight / ((this.height / 100) * (this.height / 100)) * 10.0) / 10.0);
        }
        //키가 정상적인 값을 갖고 있다면, 입력 값 그대로 사용
        return Math.round((this.weight / (this.height * this.height) * 10.0) / 10.0);
    }

    public String getBMIStatus() {
        double bmi = getBMI();
        if (bmi < 18.5) {
            return "저체중";
        } else if (bmi < 25) {
            return "정상";
        } else if (bmi < 30) {
            return "과체중";
        } else {
            return "비만";
        }
    }

    public String getName() {
        return name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}

class BMITest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //첫 번째 사용자 정보 입력
        System.out.print("첫 번째 사용자 이름: ");
        String name1 = scanner.nextLine();
        System.out.print("나이: ");
        int age1 = scanner.nextInt();
        System.out.print("키 (cm 또는 m): ");
        double height1 = scanner.nextDouble();
        System.out.print("몸무게 (kg): ");
        double weight1 = scanner.nextDouble();

        //두 번째 사용자 정보 입력
        System.out.print("두 번째 사용자 이름: ");
        scanner.nextLine();//Enter 키 제거
        String name2 = scanner.nextLine();
        System.out.print("나이: ");
        int age2 = scanner.nextInt();
        System.out.print("키 (cm 또는 m): ");
        double height2 = scanner.nextDouble();
        System.out.print("몸무게 (kg): ");
        double weight2 = scanner.nextDouble();

        //BMI 객체 생성
        BMI bmi1 = new BMI(name1, age1, weight1, height1);
        BMI bmi2 = new BMI(name2, age2, weight2, height2);

        //결과 출력
        System.out.println(name1 + "의 BMI 지수: " + bmi1.getBMI() + ", 상태: " + bmi1.getBMIStatus());
        System.out.println(name2 + "의 BMI 지수: " + bmi2.getBMI() + ", 상태: " + bmi2.getBMIStatus());

    }
}
public class exercise3 {
    public static void main(String[] args) {

    }
}

