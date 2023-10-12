import java.util.Scanner;//2023245065 이예린입니다! 문제 1번

public class Main{
    public static void main(String[] args) {
        double n2;
        Scanner price = new Scanner(System.in);
        System.out.print("Enter the price:");
        double n1 = price.nextDouble();
        n2 = n1 * 0.06;
        n2 =(int)n2;
        System.out.print("your tax:"+ n2);
    }
}