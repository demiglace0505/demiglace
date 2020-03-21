
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
                System.out.println("Give the first number:");
        Integer num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        Integer num2 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        Integer num3 = Integer.valueOf(scanner.nextLine());
        
        System.out.println( "The average is " + (1.0*(num1 + num2 + num3)/3));

    }
}
