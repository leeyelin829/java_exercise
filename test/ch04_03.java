public class ch04_03 {
    public static void main(String[] args) {
        int[] arr = {1,5, 3, 4, 5, 5};

        int max = arr[0];
        int indexmax = 0;

        for(int i = 1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                indexmax = i;
            }
        }
        System.out.printf("최댓값은 %d 인덱스는 %d",max,indexmax);
    }
}
