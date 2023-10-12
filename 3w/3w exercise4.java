public class exercise4 {//2023245065 소프트웨어학부 이예린
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {//단수 출력 2단부터 9단까지 반복
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d * %d = %d\n",i, j, i * j);//구구단
            }
            System.out.println();//한 단이 끝나면 구분해주기 위한 구문
        }
    }
}
