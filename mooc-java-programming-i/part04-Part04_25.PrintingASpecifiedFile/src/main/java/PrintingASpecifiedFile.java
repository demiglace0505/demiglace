
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.println("Which file should have its contents printed?");
        String input = inputScanner.nextLine();
        
        try (Scanner scanner = new Scanner(Paths.get(input))){
            while (scanner.hasNextLine()){
                String printed = scanner.nextLine();
                System.out.println(printed);
            }
        }
        
        catch (Exception exc) {
            System.out.println("Error: " + exc.getMessage());
        }

    }
}
