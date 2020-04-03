
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> archives = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            
            if (identifier.isEmpty()) {
                break;
            } else {
                System.out.println("Name? (empty will stop)");
                String name = scanner.nextLine();
                
                if (name.isEmpty()) {
                    break; 
                } else {
                //create new Archive object and add this instance to it
                //we can also make the program reject items that have already been previously added
                //using: 
                // if(!archives.contains(thisArchive))
                Archive thisArchive = new Archive(identifier, name);
                archives.add(thisArchive);
                
                }
            }
        }

        System.out.println("==Items==");
        //create a list of identifiers that have arleady been printed
        ArrayList<String> printedIdentifiers = new ArrayList<>();
        
        for (Archive currentArchive : archives) {
            if (printedIdentifiers.contains(currentArchive.getIdentifier())) {
                continue;
            } 
            System.out.println(currentArchive);
            printedIdentifiers.add(currentArchive.getIdentifier());
        }

    }

}
