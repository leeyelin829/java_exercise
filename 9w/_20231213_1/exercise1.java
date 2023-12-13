class MyDate {
    int year = 2035;
    int month = 12;
    int day = 25;
}

public class exercise1 {
    public static void main(String[] args) {
        try {
            MyDate d = null;
            System.out.printf("%d년 %d월 %d일\n", d.year, d.month, d.day);
        } catch (NullPointerException e) {//예외 처리
            MyDate myData = new MyDate();
            System.out.printf("%d년 %d월 %d일\n", myData.year, myData.month, myData.day);
            System.out.println("프로그램을 종료합니다.");
            System.exit(0);
        }
    }
}
