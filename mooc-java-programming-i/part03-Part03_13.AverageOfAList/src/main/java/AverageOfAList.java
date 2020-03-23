
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> intList = new ArrayList<>();
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1){
                break;
            }
            intList.add(input);
        }

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        int sum = 0;
        for (int value :intList) {
            sum = value + sum;
        }
        System.out.println("Average: " + 1.0*sum/intList.size());
    }
}
