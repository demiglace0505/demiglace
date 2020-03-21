
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        Integer num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        Integer num2 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        Integer num3 = Integer.valueOf(scanner.nextLine());
        
        System.out.println("The sum of the numbers is " + (num1 + num2 + num3));
        

    }
}
