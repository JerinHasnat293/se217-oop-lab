public class Test3 {
    
    public static void main(String[] args) {
        System.out.println("Execution Starts:");
        greetUser();

        int totalSum = calculateSum(25, 35);
        System.out.println("Final Result: " + totalSum);
    }

    static int calculateSum(int a, int b) {
        int total = a + b;
        return total;
    }

    static void greetUser() {
        System.out.println("Welcome!");
    }
}
