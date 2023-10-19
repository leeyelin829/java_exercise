import java.util.Scanner;
public class ch04_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] arr1 = new double[3][3];
        double[][] arr2 = new double[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                arr1[i][j] = sc.nextDouble();
            }
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                arr2[i][j] = sc.nextDouble();
            }
        }
        double[][] sumarr = new double[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                sumarr[i][j] =  arr1[i][j] + arr2[i][j];
            }
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(sumarr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
