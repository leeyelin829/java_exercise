import java.util.Scanner;

public class ch04_01 {
    public static void main(String[] args) {
        System.out.print("문자열 입력: ");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();//문자열 입력

        int count = 0;//대문자 개수를 셀 count 초기화

        for(int i = 0; i < s1.length(); i++) {
            char s2 = s1.charAt(i);
            if(Character.isUpperCase(s2)) {//문자가 대문자인지 확인
                count++;//대문자 개수 증가
            }
        }

        System.out.printf("대문자 개수: %d", count);//결과

    }
}
