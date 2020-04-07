
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        BirdObservatory birdList = new BirdObservatory();

        while (true) {
            System.out.print("? ");
            String inputCommand = scan.nextLine();

            if (inputCommand.equals("Quit")) {
                break;
            }

            if (inputCommand.equals("Add")) {
                addCommand(birdList, scan);
//                System.out.println(birdList.toString());
                continue;
            }

            if (inputCommand.equals("Observation")) {
                observationCommand(birdList, scan);
//                System.out.println(birdList.toString());
                continue;
            }

            if (inputCommand.equals("One")) {
                oneCommand(birdList, scan);
                continue;
            }
            
            if (inputCommand.equals("All")) {
                allCommand(birdList, scan);
                continue;
            }
        }
    }

    public static void addCommand(BirdObservatory birdList, Scanner scan) {
        System.out.print("Name: ");
        String inputName = scan.nextLine();
        System.out.print("Name in Latin: ");
        String latinName = scan.nextLine();
        Bird bird = new Bird(inputName, latinName);
        birdList.add(bird);
    }

    public static void observationCommand(BirdObservatory birdList, Scanner scan) {
        System.out.print("Name: ");
        String inputName = scan.nextLine();
        birdList.observe(inputName);

    }
    
    public static void oneCommand(BirdObservatory birdList, Scanner scan) {
        System.out.print("Bird? ");
        String inputName = scan.nextLine();
        birdList.oneBirdToString(inputName);
    }
    
    public static void allCommand(BirdObservatory birdList, Scanner scan) {
        birdList.printAll();
    }

}
