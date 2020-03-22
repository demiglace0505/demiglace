 
import java.util.Scanner;
 
public class SumOfNumbers {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //initialize
        int num = 0;
        
        while (true){
            System.out.println("Give a number:");
            int given = Integer.valueOf(scanner.nextLine());
            
            if (given ==0){
                break;
            }
            
            num = num + given;           
            
        }
        
        System.out.println("Sum of the numbers: " + num);
 
    }
}
 