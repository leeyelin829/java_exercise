import java.util.Scanner;
public class exercise4 {//2023245065 소프트웨어학부 이예린
    public static void main(String[] args) {
        int[][] Arr1 = new int[3][3];//첫 번째 배열
        int[][] Arr2 = new int[3][3];//두 번째 배열

        Scanner sc = new Scanner(System.in);

        System.out.println("3*3의 첫 번째 행렬을 작성하세요");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                Arr1[i][j] = sc.nextInt();//첫 번째 배열 입력받기
            }
        }

        System.out.println("3*3의 두 번째 행렬을 작성하세요");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                Arr2[i][j] = sc.nextInt();//두 번째 배열 입력받기
            }
        }

        int[][] Plus_Arr = new int[3][3];//더한 배열 만들기

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                Plus_Arr[i][j] = Arr1[i][j] + Arr2[i][j];//배열 더하기
            }
        }
        //더한 값을 구분해주기 위한 표식?
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");

        System.out.println("더한 결과:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(Plus_Arr[i][j] + " ");//결과
            }
            System.out.println();//행 나눠주기
        }
    }
}
