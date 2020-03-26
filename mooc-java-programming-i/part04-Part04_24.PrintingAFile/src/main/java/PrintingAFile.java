
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(Paths.get("data.txt"))) {
            while (scanner.hasNextLine()) {
                String printed = scanner.nextLine();
                System.out.println(printed);
            }
            
        }
        catch (Exception exc) {
            System.out.println("Error: " + exc.getMessage());
        }
        

    }
}
