import java.util.Scanner;

public class ch03_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if (score >= 90){
            System.out.printf("%d점은 A등급입니다.",score);
        }
        else if (score >= 80){
            System.out.printf("%d점은 B등급입니다.",score);
        }
        else if (score >= 70){
            System.out.printf("%d점은 C등급입니다.",score);
        }
        else if (score >= 60){
            System.out.printf("%d점은 D등급입니다.",score);
        }
        else{
            System.out.printf("%d점은 F등급입니다.",score);
        }

    }
}
