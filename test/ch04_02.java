import java.util.Scanner;
public class ch04_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] values = new double[5];
        for(int i =0; i < values.length;i++){
            values[i] = sc.nextDouble();
        }
        for(int j = 0; j < values.length; j++) {
            System.out.println(+values[j]);
        }
    }
}
