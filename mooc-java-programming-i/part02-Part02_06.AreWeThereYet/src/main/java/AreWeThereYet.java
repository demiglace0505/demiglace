 
import java.util.Scanner;
 
public class AreWeThereYet {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        Integer num = 0;
 
        while (true) {
            if (num == 4) {
                break;
            }
            System.out.println("Give a number:");
            num = Integer.valueOf(scanner.nextLine());
        }
 
    }
}
 
