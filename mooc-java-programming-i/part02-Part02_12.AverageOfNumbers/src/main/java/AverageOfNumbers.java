 
import java.util.Scanner;
 
public class AverageOfNumbers {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        int sum = 0;
        
        while (true){
            System.out.println("Give a number:");
            int selection = Integer.valueOf(scanner.nextLine());
            
            if (selection == 0){
                break;
            }
            
            count = count + 1;
            sum = sum + selection;
            
        }
        
        System.out.println("Number of numbers: " + count);
        System.out.println("Average of the numbers: " + (1.0*sum/count));
            
    }
}
 