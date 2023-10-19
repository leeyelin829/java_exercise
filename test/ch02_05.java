import java.util.Scanner;
public class ch02_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextInt();
        double num2 = sc.nextInt();
        double num3 = sc.nextInt();
        System.out.printf("The aver age of %.1f, %.1f, and %.1f is %.1f",num1, num2, num3, (num1 + num2 +num3) / 3);
    }
}
