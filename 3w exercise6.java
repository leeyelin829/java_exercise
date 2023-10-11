import java.util.Scanner;
public class exercise6 {//2023245065 소프트웨어학부 이예린
    public static void main(String[] args) {
        int score = 0;//점수 초기화
        for(int i = 0; i < 5; i++) {//5번 반,
            int num1 = (int) (Math.random() * 9 + 1);//랜덤으로 숫자 생성 1부터 9까지
            int num2 = (int) (Math.random() * 9 + 1);//랜덤으로 숫자 생성 1부터 9까지
            int num3 = 0;
            Scanner sc = new Scanner(System.in);
            if (num1 < num2){
                num3 = num2 - num1;//정답
                System.out.printf("%d - %d = ?\n",num2, num1);//문제, num2가 num1보다 크기 때문에 위치 바꿈
                int num4 = sc.nextInt();//정답 입력받기
                if (num4 == num3){//정답일 때
                    System.out.print("정답입니다\n");
                    score = score + 1;//점수 추가
                }
                else {//정답이 아닐 때
                    System.out.printf("틀렸습니다. 정답은 %d입니다.\n",num3);//틀렸다는 것을 확인시킨 후 정답 출력
                }
            }
            else {
                num3 = num1 - num2;//정답
                System.out.printf("%d - %d = ?\n",num1, num2);//문제
                int num4 = sc.nextInt();//정답 입력받기
                if (num4 == num3){//정답일 때
                    System.out.print("정답입니다\n");
                    score = score + 1;//점수 추가
                }
                else {//정답이 아닐 때
                    System.out.printf("틀렸습니다. 정답은 %d입니다.\n",num3);//틀렸다는 것을 확인시킨 후 정답 출력
                }
            }

        }
        System.out.printf("맞은 개수: %d",score);//맞은 개수 출력
    }
}
