
import java.util.ArrayList;
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
public class BirdObservatory {

    private ArrayList<Bird> birdList;

    public BirdObservatory() {
        this.birdList = new ArrayList<>();
    }

    public void add(Bird bird) {
        this.birdList.add(bird);
    }

    public void observe(String birdName) {
        boolean found = false;
        for (Bird currentBird : this.birdList) {
            if (birdName.equals(currentBird.getName())) {
                currentBird.observeUp();
                found = true;
                break;
            }
        }
        if (found == false) {
            System.out.println("Not a bird!");
        }
    }

    public void oneBirdToString(String birdName) {
        boolean found = false;
        for (Bird currentBird : this.birdList) {
            if (birdName.equals(currentBird.getName())) {
                System.out.println(currentBird.toString());
                found = true;
                break;
            }
        }
        if (found == false) {
            System.out.println("Not a bird!");
        }
    }
    
    public void printAll(){
        for (Bird currentBird : this.birdList) {
            System.out.println(currentBird.toString());
        }
    }

    public String toString() {
        String printOut = "";
        for (Bird currentBird : this.birdList) {
            printOut = printOut + "\n" + currentBird.toString();
        }
        return printOut;
    }
}
