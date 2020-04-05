
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kuchai
 */
public class JokeManager {

    private ArrayList<String> jokeList;

    public JokeManager() {
        this.jokeList = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.jokeList.add(joke);
    }

    public String drawJoke() {
        if (this.jokeList.isEmpty()) {
            return "Jokes are in short supply.";
        }
        //randomize number within index of jokeList
        Random randomNum = new Random();
        int randomIndex = randomNum.nextInt(jokeList.size());
        return jokeList.get(randomIndex);
    }
    
    public void printJokes(){
        for (String currentJoke : jokeList) {
            System.out.println(currentJoke);
        }
    }

}
