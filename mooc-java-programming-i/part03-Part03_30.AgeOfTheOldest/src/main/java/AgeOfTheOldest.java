
import java.util.ArrayList;
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> ages = new ArrayList<>();
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            }
            String[] parts = input.split(",");
            ages.add(Integer.valueOf(parts[1]));
                       
                      
        }
        int maxAge = 0;
        for (int compareAges : ages) {
            if (maxAge < compareAges) {
                maxAge = compareAges;
            }
        }
        
        System.out.println("Age of the oldest: " + maxAge);


    }
}
