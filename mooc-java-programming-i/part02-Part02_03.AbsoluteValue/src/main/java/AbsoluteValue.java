 
import java.util.Scanner;
 
public class AbsoluteValue {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter number:");
        
        Integer num = Integer.valueOf(scanner.nextLine());
        
        if (num < 0){
            System.out.println(num*-1);
        } else {
            System.out.println(num);
        }
 
    }
}
 