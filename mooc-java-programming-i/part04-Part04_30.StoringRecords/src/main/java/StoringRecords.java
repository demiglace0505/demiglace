
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String filename = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(filename);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        
        for (Person currentPerson : records) {
            System.out.println(currentPerson);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

        // Write here the code for reading from file
        // and printing the read records
        try(Scanner fileScanner = new Scanner(Paths.get(file))){
            while (fileScanner.hasNextLine()){
                String details = fileScanner.nextLine();
                
                //split values into name,age
                String[] splitted = details.split(",");
                String name = splitted[0];
                int age = Integer.valueOf(splitted[1]);
                //create person with current name,age                
                persons.add(new Person(name, age));
                                
            }
            
        }
        
        catch (Exception err){
            System.out.println(err);
        }
        
        return persons;

    }
}
