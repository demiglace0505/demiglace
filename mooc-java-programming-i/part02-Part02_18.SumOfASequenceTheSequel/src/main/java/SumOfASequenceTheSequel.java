
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number?");
        Integer first = Integer.valueOf(scanner.next());
        System.out.println("Last number?");
        Integer last = Integer.valueOf(scanner.next());
        
        int sum =0;
        for (int i = first; i <= last; i++){
            sum = sum + i;
        }
        
        System.out.println("The sum is " + sum);
    }
}
