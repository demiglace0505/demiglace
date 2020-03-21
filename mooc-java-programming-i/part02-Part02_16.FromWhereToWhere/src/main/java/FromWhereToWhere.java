
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        Integer to = Integer.valueOf(scanner.next());
        System.out.println("Where from?");
        Integer from = Integer.valueOf(scanner.next());
        
        for (int i = from; i <= to; i++){
            System.out.println(i);
        }
    }
}
