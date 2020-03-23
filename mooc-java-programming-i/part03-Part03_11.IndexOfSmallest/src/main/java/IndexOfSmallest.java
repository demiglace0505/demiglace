
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> intList = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999){
                break;
            }
            intList.add(input);
        }
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        
        //finding smallest value
        //initialize variable for smallest
        int smallest = intList.get(0);
        
        for (int i = 0 ; i < intList.size() ; i++) {
            //compare to current number
            int currentNumber = intList.get(i);
            if (smallest > currentNumber){
                smallest = currentNumber;
              
            }
          
        }
        System.out.println("Smallest number: " + smallest);
        
        //finding index
        for (int i = 0 ; i < intList.size() ; i++) {
            if (smallest == intList.get(i)) {
                System.out.println("Found at index: " + i);
            }
        }
        
    }
}
