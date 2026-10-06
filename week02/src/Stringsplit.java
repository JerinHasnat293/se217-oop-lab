public class Stringsplit {
    public static void main(String[] args) {
        String text = "Java#Programming#Language";
        String[] parts = text.split("#");

        for(int i = 0; i < parts.length; i++) {
            System.out.println(parts[i]);
        }
    }
}