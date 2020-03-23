
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer longestNameLength = 0;
        String longestName = "";
        Integer ageSum = 0;
        Integer counter = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] splitted = input.split(",");

            //longest name
            if (splitted[0].length() > longestNameLength) {
                longestNameLength = splitted[0].length();
                longestName = splitted[0];
            }
            //years
            ageSum = ageSum + Integer.valueOf(splitted[1]);
            counter = counter + 1;

        }

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + 1.0 * ageSum / counter);

    }

}


 /* ALTERNATE SOLUTION
import java.util.ArrayList;
import java.util.Scanner;
 
public class PersonalDetails {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> birthYears = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
 
            String[] parts = input.split(",");
            names.add(parts[0]);
            birthYears.add(Integer.valueOf(parts[1]));
        }
        
        String longest = names.get(0);
        for (String name : names) {
            if(name.length() > longest.length()) {
                longest = name;
            }
        }
        System.out.println("Longest name: " + longest);
        
        int sumOfBirthYears = 0;
        for (int year : birthYears) {
            sumOfBirthYears = sumOfBirthYears + year;
        }
        System.out.println("Average of the birth years: " + 1.0 * sumOfBirthYears / birthYears.size());
 
    }
}
 */