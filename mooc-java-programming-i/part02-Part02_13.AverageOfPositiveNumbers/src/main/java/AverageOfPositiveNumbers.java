 
import java.util.Scanner;
 
public class AverageOfPositiveNumbers {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int countpos = 0;
        int sum = 0;
 
        while (true) {
            System.out.println("Give a number:");
            int selection = Integer.valueOf(scanner.nextLine());
 
            if (selection == 0) {
                break;
            }
 
            if (selection > 0) {
                sum = sum + selection;
                countpos = countpos + 1;
                continue;
            }
            
        }
        
        if (countpos == 0) {
            System.out.println("Cannot calculate the average");
        } else {            
            System.out.println((1.0 * sum / countpos));
        }
    }
}
 