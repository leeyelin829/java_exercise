public class ch02_02 {
    public static void main(String[] args) {
        double radius = 5;
        double area = 0;
        final double PI = 3.141592;
        area = radius * radius * PI;
        System.out.println("area: "+ area);
        System.out.printf("area: %.3f \n", area);
        System.out.print("area: ");
        System.out.print(area);
    }
}
