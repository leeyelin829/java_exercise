import java.util.Scanner;//2023245065 이예린입니다!
public class Main {
    public static void main(String[] args) {
        Scanner time = new Scanner(System.in);

        System.out.print("Enter the time:");
        double n1 = time.nextDouble();
        double n2;
        double n3;
        n2 = 1000 - (0.5 * 9.81 * n1 * n1);
        n3 = 0.5 * 9.81 * n1 * n1;
        System.out.printf("현재위치 : 상공 %f m\n", n2);
        System.out.printf("이동거리 : %f m", n3);
        }
    }
