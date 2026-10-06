public class Method2 {
    public static void main(String[] args) {
        findFactors(20);
    }

    static void findFactors(int n) {
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                System.out.println(i);
            }
        }
    }
}