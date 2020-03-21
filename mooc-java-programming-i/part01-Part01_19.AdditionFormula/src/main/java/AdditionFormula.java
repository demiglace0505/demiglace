
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program 
        System.out.println("Give the first number:");
        Integer num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        Integer num2 = Integer.valueOf(scanner.nextLine());
        
        System.out.println( num1 + " + " + num2 + " = " + (num1 + num2));

    }
}
