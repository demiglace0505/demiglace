/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kuchai
 */
public class Container {
    private int liquid;
    
    public Container() {
        
    }
    
    public int contains() {
        return this.liquid;
    }
    
    public void add(int amount){
        if (amount < 0) {
            return;
        }
        if (this.liquid + amount > 100){
            this.liquid = 100;
            return;
        }
        this.liquid = this.liquid + amount;
    }
    
    public void remove(int amount){
        if (amount < 0 ){
            return;
        }
        if (amount > this.liquid ) {
            this.liquid = 0;
            return;
        }
        this.liquid = this.liquid - amount;
    }
    
    public String toString(){
        return this.contains() + "/100";
    }

    public void setLiquid(int liquid) {
        this.liquid = liquid;
    }
    
    public boolean isLessThan(int amount){
        return (this.liquid < amount);
    }
    
    
}
