import java.util.Arrays;
public class exercise3 {//2023245065 소프트웨어학부 이예린
    public static void main(String[] args) {
        double[] values = {1,9,4.5,6.6,5.7,-4.5};//배열 선언
        System.out.println(Arrays.toString(values));//정렬된 배열 출력

        for(int i = 0; i < values.length - 1; i++){//버블 sort 사용
            for(int j = 0; j< values.length - 1 - i; j++){
                if(values[j] > values[j + 1]){
                    double temp = values[j + 1];
                    values[j + 1] = values[j];
                    values[j] = temp;
                }
            }
        }
        System.out.println("...");
        System.out.println(Arrays.toString(values));//정렬된 배열 출력
    }
}
