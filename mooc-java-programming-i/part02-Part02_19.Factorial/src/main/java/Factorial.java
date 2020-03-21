
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        Integer input = Integer.valueOf(scanner.next());
        
        int fac =1;
        for (int i = 1; i <= input; i++){
            fac = fac * i;
        }
        
        System.out.println("Factorial: " + fac);
    }
}
