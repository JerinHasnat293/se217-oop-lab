public class Array1 {
    public static void main(String[] args) {
        int arr[] = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        int result = arr[0] + arr[2];
        System.out.println("Result value is: " + result);

        arr[2] = 100;
        result = arr[0] + arr[2];
        System.out.println("Result value is: " + result);
    }
}