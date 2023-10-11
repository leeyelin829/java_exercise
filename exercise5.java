import java.util.Scanner;
public class exercise5 {//2023245065 소프트웨어학부 이예린
    public static void main(String[] args) {
        int[] Seat = {0,0,0,0,0,0,0,0,0,0};//자리 배열
        int[] Reserved_Seat = {1,1,1,1,1,1,1,1,1,1};//자리 배열을 채울 10개의 예약완료 배열
        int Answer = 1;//답변을 1로 초기화
        Scanner sc = new Scanner(System.in);

        while(Answer == 1) {//답변이 1일 때만 반복
            System.out.println("좌석을 예약하시겠습니까? (1또는 0)");
            Answer = sc.nextInt();

            if(Answer == 1) {//답변이 1일 때
                System.out.println("현재의 예약 상태는 다음과 같습니다.");
                System.out.println("----------------------------");
                System.out.println("1 2 3 4 5 6 7 8 9 10");
                System.out.println("----------------------------");

                for(int i = 0; i < 10; i++) {//현재 좌석 상황 출력
                    System.out.printf("%d ", Seat[i]);
                }

                System.out.println("\n몇 번쨰 좌석을 예약하시겠습니까?");

                int Seat_Number = sc.nextInt();
                if(Seat_Number < 11 && Seat_Number > 0){//1부터 10까지의 자리만 예약 가능
                    if(Seat[Seat_Number - 1] == 0){//이미 예약된 자리가 아닐 경우
                        Seat[Seat_Number - 1] = Reserved_Seat[Seat_Number - 1];//현재 좌석을 예약으로 전환
                        System.out.println("예약되었습니다.");
                    }
                    else{
                        System.out.println("이미 예약된 자리입니다.");//이미 예약된 자리일 경우의 출력
                    }
                }
                else{
                    System.out.println("올바른 자리 번호를 입력해주세요");//자리 번호가 올바르지 않을 경우의 출력
                }
            }
            else{
                break;//1 이외의 다른 번호를 적으면 while 탈출
            }
        }

        System.out.println("시스템이 종료되었습니다.");//시스템 종료
    }
}
