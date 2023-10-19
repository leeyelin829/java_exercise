public class ch04_05 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2};
        int[] temp = new int[1];
        System.out.printf("%d %d\n", arr1[0], arr1[1]);
        temp[0] = arr1[0];
        arr1[0] = arr1[1];
        arr1[1] = temp[0];
        System.out.printf("%d %d", arr1[0], arr1[1]);
    }
}
