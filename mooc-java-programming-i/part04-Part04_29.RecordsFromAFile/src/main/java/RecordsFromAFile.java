
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //prompt for filename
        System.out.println("Name of the file: ");
        String filename = scanner.nextLine();

        //scan file
        try ( Scanner fileScanner = new Scanner(Paths.get(filename))) {
            while (fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                
                //split current line
                String[] splitted = line.split(",");
                //assign to name and age
                String name = splitted[0];
                String age = splitted[1];
                System.out.println("");
                
                //print name of current entry
                System.out.print(name + ", ");
                
                //print age of current entry
                if (Integer.valueOf(age) == 1) {
                    System.out.print("age: " + age + " year");
                } else {
                    System.out.print("age: " + age + " years");
                }
            }

        }
        
        catch (Exception err) {
            System.out.println(err);
        }

    }
}
