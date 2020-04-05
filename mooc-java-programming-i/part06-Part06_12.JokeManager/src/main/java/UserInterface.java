
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
    private JokeManager jokeManager;
    private Scanner scanner;
    
    public UserInterface(JokeManager jokeManager, Scanner scanner){
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }
    
    public void start(){
        while (true) {
            System.out.println("Commands: ");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            //choose a command
            String inputCommand = scanner.nextLine();
            
            if (inputCommand.equals("1")) {
                input1();
                continue;
            }
            
            if (inputCommand.equals("2")) {
                input2();
                continue;
            }
            
            if (inputCommand.equals("3")) {
                input3();
                continue;
            }
            
            if (inputCommand.equals("X"))
            break;
        }
    }
    
    public void input1(){
        System.out.println("Write the joke to be added:");
        String input = scanner.nextLine();
        this.jokeManager.addJoke(input);
    }
    
    public void input2(){
        System.out.println("Drawing a joke.");
        System.out.println(this.jokeManager.drawJoke());
    }
    
    public void input3(){
        System.out.println("Printing the jokes.");
        this.jokeManager.printJokes();
    }
}
