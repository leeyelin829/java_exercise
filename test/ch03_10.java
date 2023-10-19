public class ch03_10 {
    public static boolean prime(int num){

        if(num <= 3){
            return true;
        }
        if(num % 2 == 0 || num % 3 == 0){
            return false;
        }
        int i = 5;
        while (i*i <= num){
            if(num % i == 0 || num %(i + 2) ==0){
                return false;
            }
            i += 6;
        }
        return true;
    }
    public static void main(String[] args) {
        int num = 2;
        int primecount = 0;

        while (primecount <50){
            if(prime(num)){
                System.out.print(num+" ");
                primecount++;
                if(primecount % 10 ==0){
                    System.out.println();
                }
            }
            num++;
        }
    }
}
