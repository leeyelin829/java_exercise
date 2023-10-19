import java.util.Scanner;

public class ch04_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: ");
        String input = scanner.nextLine();

        String reversed = reverseString(input);

        System.out.println("입력한 문자열을 역순으로 출력: " + reversed);

        scanner.close();
    }

    // 문자열을 역순으로 변환하는 함수
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
