public class ch02_03 {
    public static void main(String[] args) {
        double amount = 197.55;
        double tax = 0;

        tax = amount * 0.06;
        int inttax = (int)tax;
        System.out.println("Sales tax is $"+inttax);
    }
}
