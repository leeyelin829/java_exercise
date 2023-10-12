import java.util.Scanner;//2023245065 이예린입니다!
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n1 = sc.nextInt();

        String num = (n1 > 0) ? "양수" : (n1 < 0) ? "음수" : "0";
        System.out.println(num + "입니다.");
    }
}