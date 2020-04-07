
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kuchai
 */
public class UserInterface {

    private Container firstContainer;
    private Container secondContainer;
    private Scanner scanner;

    public UserInterface(Container firstContainer, Container secondContainer, Scanner scanner) {
        this.firstContainer = firstContainer;
        this.secondContainer = secondContainer;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {
            System.out.println("First: " + firstContainer.toString());
            System.out.println("Second: " + secondContainer.toString());
            String input = scanner.nextLine();
            String[] splitted = input.split(" ");
            String inputCommand = splitted[0];

            if (inputCommand.equals("quit")) {
                break;
            }
            int amount = Integer.valueOf(splitted[1]);

            //ADD
            if (inputCommand.equals("add")) {
                firstContainer.add(amount);
                continue;
            }
            
            if (inputCommand.equals("move")) {
                
                if (firstContainer.contains() < amount) {
                    amount = firstContainer.contains();
                    firstContainer.remove(amount);
                    secondContainer.add(amount);
                    continue;
                } else {
                    firstContainer.remove(amount);
                    secondContainer.add(amount);
                    continue;
                }
            }
            
            //REMOVE
            if (inputCommand.equals("remove")) {
                secondContainer.remove(amount);
                continue;
            }

        }

    }

}
