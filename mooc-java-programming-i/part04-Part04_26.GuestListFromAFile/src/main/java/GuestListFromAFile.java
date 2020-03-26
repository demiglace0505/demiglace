
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GuestListFromAFile {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = inputScanner.nextLine();

        ArrayList<String> list = new ArrayList<>();
        // implement reading the file here.
        System.out.println("");
        
        try (Scanner guestScanner = new Scanner(Paths.get(file))) {
            while (guestScanner.hasNextLine()) {
                list.add(guestScanner.nextLine());
            }
        }
        
        catch (Exception err) {
            System.out.println("Error: " + err.getMessage());
        }
        
//        System.out.println(list);

        System.out.println("Enter names, an empty line quits.");
        while (true) {
            String name = inputScanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            if (list.contains(name)) {
                System.out.println("The name is on the list.");
            } else {
                System.out.println("The name is not on the list.");
            }
        }

        System.out.println("Thank you!");

    }
}
