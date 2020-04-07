/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kuchai
 */
public class Bird {

    private String name;
    private String latinName;
    private int obsCount;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.obsCount = 0;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getObsCount() {
        return obsCount;
    }
    
    public void observeUp(){
        this.obsCount = this.obsCount + 1;
    }

    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.obsCount + " observations";
    }

}
