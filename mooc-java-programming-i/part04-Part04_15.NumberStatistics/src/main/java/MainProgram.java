
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        Statistics statistics = new Statistics();
        statistics.addNumber(1);
        statistics.addNumber(2);
        statistics.addNumber(3);
        statistics.addNumber(4);
        statistics.addNumber(5);

        //part 1
        System.out.println("Count: " + statistics.getCount());

        //part 2
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());

        //part 3
        Statistics userStat = new Statistics();
        //part 4
        Statistics evenStat = new Statistics();
        Statistics oddStat = new Statistics();

        System.out.println("Enter numbers:");
        while (true) {
            int userInput = Integer.valueOf(scanner.nextLine());
            if (userInput == -1) {
                break;
            }
            if (userInput % 2 == 0) {
                userStat.addNumber(userInput);
                evenStat.addNumber(userInput);
            } else {
                userStat.addNumber(userInput);
                oddStat.addNumber(userInput);
            }

        }
        System.out.println("Sum: " + userStat.sum());
        System.out.println("Sum of even numbers: " + evenStat.sum());
        System.out.println("Sum of odd numbers: " + oddStat.sum());

    }
}
