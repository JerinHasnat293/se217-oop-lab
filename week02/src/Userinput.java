import java.util.Scanner;

public class Userinput {
    
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);
        double value;
        
        System.out.println("Please enter a decimal number: ");
        value = inputObj.nextDouble();
        
        System.out.println("Entered value = " + value);
        
        inputObj.close();
    }
}
