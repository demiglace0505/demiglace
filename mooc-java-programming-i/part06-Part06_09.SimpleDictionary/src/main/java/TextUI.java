
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
public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dict;

    public TextUI(Scanner scanner, SimpleDictionary dict) {
        this.scanner = scanner;
        this.dict = dict;
    }

    public void start() {

        while (true) {
            System.out.print("Command: ");
            String inputCommand = scanner.nextLine();

            if (inputCommand.equals("end")) {
                endCommand();
                break;
            }

            if (inputCommand.equals("add")) {
                addCommand();
                continue;
            }

            if (inputCommand.equals("search")) {
                searchCommand();
                continue;
            }

            System.out.println("Unknown command");
            continue;
        }
    }

    public void endCommand() {
        System.out.println("Bye bye!");
    }

    public void addCommand() {
        System.out.print("Word: ");
        String inputWord = scanner.nextLine();
        System.out.print("Translation: ");
        String inputTranslation = scanner.nextLine();

        dict.add(inputWord, inputTranslation);
    }

    public void searchCommand() {
        System.out.println("To be translated: ");
        String inputWord = scanner.nextLine();
        //check if null
        if ( dict.translate(inputWord) == null) {
            System.out.println("Word " + inputWord + " was not found");
        } else {
            System.out.println("Translation: " + dict.translate(inputWord));
        }

    }

}
