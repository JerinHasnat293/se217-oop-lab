public class Darrey {
    public static void main(String[] args) {
        int data[][] = {
            {10, 20, 30},
            {40, 50, 60}
        };

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}