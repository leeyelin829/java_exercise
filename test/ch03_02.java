import java.util.Scanner;

public class ch03_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any three integers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int maxnum = 0;
        int minnum = 0;
        if (num1 >= num2){
            if (num1 > num3){
                maxnum = num1;
            }
            else {
                maxnum = num3;
            }
        }
        else{
            if (num2 >= num3){
                maxnum = num2;
            }
            else {
                maxnum = num3;
            }
        }
        if (num1 <= num2){
            if (num1 < num3){
                minnum = num1;
            }
            else {
                minnum = num3;
            }
        }
        else{
            if (num2 <= num3){
                minnum = num2;
            }
            else {
                minnum = num3;
            }
        }
        System.out.println("최댓값:"+maxnum);
        System.out.println("최솟값:"+minnum);
    }
}
