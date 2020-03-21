
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        Integer input = 0;
        Integer sum = 0;
        Integer count = 0;
        Integer even = 0;
        Integer odd = 0;

        while (true) {
            input = Integer.valueOf(scanner.nextLine());
            
            if (input == -1) {
                break;
            }
            sum = sum + input;
            count = count + 1;
            
            if (input%2 == 0){
                even = even + 1;
            } else {
                odd = odd + 1;
            }
        }

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + 1.0*sum/count);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
