
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        
        System.out.println("The numbers in the range [0,4]: ");
        printNumbersInRange(numbers, 0, 4);
    }
    
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (int value : numbers){
            if (value >= lowerLimit && value <= upperLimit) {
                System.out.println(value);
            }
        }
    }
    
}
