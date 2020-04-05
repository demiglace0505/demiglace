
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kuchai
 */
public class WordSet {
    private ArrayList<String> wordsList;
    
    public WordSet() {
        this.wordsList = new ArrayList<>();
    }
    
    public boolean contains(String word) {
        return this.wordsList.contains(word);
    }
    
    public void add(String word){
        this.wordsList.add(word);
    }
    
    public int palindromes(){
        //counts number of palindromes
        int count = 0;
        for (String currentWord : this.wordsList) {
            if (isPalindrome(currentWord)){
                count ++;
            }
        }
        return count;
    }
    
    public boolean isPalindrome(String word){
        int noOfChars = word.length() - 1;
        int i = 0;
        while (i < word.length() / 2) {
            //charAt returns character of x index
            if (word.charAt(i) != word.charAt(noOfChars - i)){
                return false;
            }
            i++;
        }
        return true;
    }
    
    
}
