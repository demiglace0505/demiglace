
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
public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> suitcaseList;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        suitcaseList = new ArrayList<>();
    }

    public int totalWeight() {
        int currentWeight = 0;
        for (Suitcase currentSuitcase : suitcaseList) {
            currentWeight = currentWeight + currentSuitcase.totalWeight();
        }
        return currentWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        int currentWeight = totalWeight();
        if ((currentWeight + suitcase.totalWeight()) <= this.maxWeight) {
            this.suitcaseList.add(suitcase);
        }
    }
    
    public void printItems(){
        for (Suitcase currentSuitcase : suitcaseList) {
            currentSuitcase.printItems();
        }       
    }

    @Override
    public String toString() {
        return this.suitcaseList.size() + " suitcases (" + this.totalWeight() + "kg)";
    }
    
}
