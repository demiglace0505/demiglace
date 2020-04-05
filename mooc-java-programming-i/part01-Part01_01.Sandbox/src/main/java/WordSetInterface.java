
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
public class WordSetInterface {
    private WordSet wordSet;
    private Scanner scanner;
    
    public WordSetInterface(WordSet wordSet , Scanner scanner) {
        this.wordSet = wordSet;
        this.scanner = scanner;
    }
    
    public void start() {
        
        while (true) {
            System.out.println("Enter a word: ");
            String word = scanner.nextLine();
            
            if (this.wordSet.contains(word)){
                break;
            }
            this.wordSet.add(word);
        }
        System.out.println("You gave the same word twice!");
    }
}
