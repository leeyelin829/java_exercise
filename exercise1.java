import java.util.Scanner;//2023245065 소프트웨어학부 이예린

public class exercise1 {
    public static void main(String[] args) {
        System.out.print("enter your score");
        Scanner sc = new Scanner(System.in);//점수 입력받기
        int score = sc.nextInt();
        if (score >= 90){//90점 이상
            System.out.print("A");//A학점 출력
        }
        else if(score >= 80){//80점 이상
            System.out.print("B");//B학점 출력
        }
        else if(score >= 70){//70점 이상
            System.out.print("C");//C학점 출력
        }
        else if(score >= 60){//60점 이상
            System.out.print("D");//D학점 출력
        }
        else{//그 외 ex)60점 미만
            System.out.print("F");//F학점 출력
        }
    }
}
