import java.util.Arrays;

public class ch04_06 {
    public static void main(String[] args) {
        double[] arr = {1.0, 9.0, 4.5, 6.6, 5.7, -4.5};
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i < arr.length - 1; i++){//버블 sort 사용
            for(int j = 0; j< arr.length - 1 - i; j++){
                if(arr[j] > arr[j + 1]){
                    double temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
