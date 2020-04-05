
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
public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> itemsInSuitCase = new ArrayList<>();
    
    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
        itemsInSuitCase = new ArrayList<>();
    }
    
    public int totalWeight(){
        int currentWeight = 0;
        for (Item currentItem : itemsInSuitCase){
            currentWeight = currentWeight + currentItem.getWeight();
        }
        return currentWeight;
    }
    
    public void addItem(Item item){
        int currentWeight = totalWeight();
        if ( (currentWeight+item.getWeight()) <= this.maxWeight ){
            this.itemsInSuitCase.add(item);
        }
    }
    
    public String toString(){
        if (itemsInSuitCase.isEmpty()) {
            return "no items (" + totalWeight() + " kg)";
        }
        if (itemsInSuitCase.size() == 1) {
            return itemsInSuitCase.size() + " item (" + this.totalWeight() + " kg)";
        }
        return itemsInSuitCase.size() + " items (" + this.totalWeight() + " kg)";
    }
    
    public void printItems(){
        for (Item currentItem : itemsInSuitCase) {
            System.out.println(currentItem);
        }
    }
    
    public Item heaviestItem(){
        if (this.itemsInSuitCase.isEmpty()){
            return null;
        }
        Item returnObject = this.itemsInSuitCase.get(0);
        for (Item currentItem : itemsInSuitCase) {
            if (currentItem.getWeight() > returnObject.getWeight()) {
                returnObject = currentItem;
            }
        }
        return returnObject;
    }
}
