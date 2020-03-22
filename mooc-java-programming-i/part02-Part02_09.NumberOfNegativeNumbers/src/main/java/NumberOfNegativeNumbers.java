 
import java.util.Scanner;
 
public class NumberOfNegativeNumbers {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //counter
        int num = 0;
 
        while (true) {
            System.out.println("Give a number:");
            int selection = Integer.valueOf(scanner.nextLine());
 
            if (selection == 0) {
                break;
            }
 
            if (selection < 0) {
                num = num + 1;
                continue;
 
            }
        }
        System.out.println("Number of negative numbers: " + num);
 
    }
}
 
