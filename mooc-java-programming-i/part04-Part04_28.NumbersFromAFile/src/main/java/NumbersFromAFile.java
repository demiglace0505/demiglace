
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int valid = 0;
        
        try ( Scanner fileScanner = new Scanner(Paths.get(file))) {

            while (fileScanner.hasNextLine()) {
                int currentNum = Integer.valueOf(fileScanner.nextLine());
                if (( currentNum >= lowerBound)
                        && (currentNum <= upperBound)) {
                    valid = valid + 1;
                }
            }
        } catch (Exception err) {
            System.out.println(err);
        }

        System.out.println("Numbers: " + valid);

    }

}
