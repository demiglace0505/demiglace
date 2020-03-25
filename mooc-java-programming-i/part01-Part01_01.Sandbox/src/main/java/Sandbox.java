import java.util.ArrayList;
import java.util.Scanner;

public class Sandbox {

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            System.out.print("Enter name and age separated by comma: ");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String[] splitted = input.split(",") ;
            String name = splitted[0];
            int age = Integer.valueOf(splitted[1]);
            
            persons.add(new Person(name, age));
        }
        System.out.println("What is the age limit?");
        int ageLimit = Integer.valueOf(scanner.nextLine());
        
        System.out.println("");
        
        for (Person person : persons) {
            if (person.getAge() >= ageLimit ) {
                System.out.println(person);
            }
        }     
        
        
        
    }
      
}
