public class exercise2 {//2023245065 소프트웨어학부 이예린
    public static void main(String[] args) {
        int[] values = {1,2};//1과 2를 요소로 가지는 배열 선언
        System.out.printf("values[0] = %d,values[1] = %d\n",values[0],values[1]);//원래 배열 출력
        int[] temp = new int[1];//빈 공간 생성

        temp[0] = values[1];//빈 공간에 임시로 값 저장
        //값 교환
        values[1] = values[0];
        values[0] = temp[0];

        System.out.println("...");
        System.out.printf("values[0] = %d,values[1] = %d",values[0],values[1]);//값을 서로 교환한 배열 출력
    }
}
