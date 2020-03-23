
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String oldestPerson = "";
        Integer maxAge = 0;
        
        while(true){
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            }
            String[]splitted = input.split(",");
            int age = Integer.valueOf(splitted[1]);
            if (age > maxAge){
                maxAge = age;
                oldestPerson = splitted[0];
            }
        }
        
        System.out.println("Name of the oldest: " + oldestPerson);
        


    }
}
