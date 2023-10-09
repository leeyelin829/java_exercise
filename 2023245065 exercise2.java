import java.util.Scanner;//소프트웨어학부 2023245065 이예린입니다!
public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.printf("Simple Calculator");
        System.out.print("Enter the first number:");
        int n1 = Sc.nextInt();
        System.out.print("Enter the second number:");
        int n2 = Sc.nextInt();
        System.out.printf("%d + %d = %d\n", n1, n2, n1 + n2);
        System.out.printf("%d - %d = %d\n", n1, n2, n1 - n2);
        System.out.printf("%d * %d = %d\n", n1, n2, n1 * n2);
        System.out.printf("%d / %d = %d\n", n1, n2, n1 / n2);
        System.out.printf("%d %% %d = %d\n", n1, n2, n1 % n2);
        }
    }
