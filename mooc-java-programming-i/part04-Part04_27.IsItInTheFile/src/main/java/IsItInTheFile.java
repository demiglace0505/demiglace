
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        try ( Scanner fileScanner = new Scanner(Paths.get(file))) {
            
            while(fileScanner.hasNextLine()) {
                list.add(fileScanner.nextLine());
            }
            if (list.contains(searchedFor)) {
                System.out.println("Found!");
            } else { 
                System.out.println("Not found.");
            }
            
//            String scanned = fileScanner.toString();
//            
//            if (scanned.contains(searchedFor)) {
//                System.out.println("Found!");
//            } else {
//                System.out.println("Not Found.");
//            }
            
        } catch (Exception err) {
            System.out.println("Reading the file " + file + " failed.");
        }

    }
}
