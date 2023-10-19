import java.util.Scanner;
public class ch04_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 수 입력하세용: ");
        int num = sc.nextInt();
        double[] numbers = new double[num];

        System.out.print("배열의 값을 입력하세용:");
        for(int i = 0; i<num; i++){
            numbers[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for(int i = 0; i < num; i++){
            sum += numbers[i];
        }

        double average = sum / num;
        int count = 0;

        for(int i =0; i < num; i++ ){
            if(average < numbers[i]){
                count++;
            }
        }

        System.out.printf("average: %.2f \n", average);
        System.out.printf("average보다 큰 수: %d \n", count);
    }
}
