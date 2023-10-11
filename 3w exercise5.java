import java.util.Scanner;//2023245065 소프트웨어학부 이예린
public class exercise5 {
    public static void main(String[] args) {
        System.out.println("컴퓨터가 0에서 100까지의 수를 무작위로 생성합니다! 맞춰보세요!");
        int random_num = (int)(Math.random() * 101);//랜덤으로 숫자 생성 0부터 100까지
        Scanner sc = new Scanner(System.in);//num 입력받기
        int num = 0;
        while (num != random_num){//num과 random_num이 다를 때 반복
            System.out.print("enter your num:");
            num = sc.nextInt();

            if (num > random_num){//num이 random_num보다 크면
                System.out.print("down\n");//down 출력
            }
            else if (num < random_num){//num이 random_num보다 작을 때
                System.out.print("up\n");//up 출력
            }
            else {
                System.out.println("");//같을 때
            }
        }
        System.out.printf("맞습니다! 숫자는 %d 입니다",random_num);

    }
}
