import java.util.Scanner;//2023245065 소프트웨어학부 이예린
public class exercise2 {
    public static void main(String[] args) {
        System.out.print("enter your num1:");
        Scanner sc = new Scanner(System.in);//num1 입력받기
        int num1 = sc.nextInt();
        System.out.print("enter your num2:");//num2 입력받기
        int num2 = sc.nextInt();
        System.out.print("choice \n 1.+ \n 2.- \n 3.* \n 4./ \n 5.% \n");//연산 선택받기
        int calculation = sc.nextInt();

        if (calculation == 1){
            System.out.printf("%d + %d = %d",num1, num2, num1 + num2);//덧셈
        }
        else if (calculation == 2){
            System.out.printf("%d - %d = %d",num1, num2, num1 - num2);//뺼셈
        }
        else if (calculation == 3){
            System.out.printf("%d * %d = %d",num1, num2, num1 * num2);//곱셈
        }
        else if (calculation == 4){
            System.out.printf("%d / %d = %d",num1, num2, num1 / num2);//나누기
        }
        else if (calculation == 5){
            System.out.printf("%d %% %d = %d",num1, num2, num1 % num2);//나머지
        }
        else {
            System.out.print("Wrong Input");//잘못된 선택
        }

    }
}
