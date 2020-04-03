/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kuchai
 */
public class Fitbyte {
    private int age;
    private int restHeartRate;
    
    public Fitbyte(int age, int restHeartRate) {
        this.age = age;
        this.restHeartRate = restHeartRate;
    }
    
    public double maxHeartRate(int age){
        return 206.3 - (0.711 * age);
    }
    
    public double targetHeartRate(double percentMax){
        return ( this.maxHeartRate(this.age) - this.restHeartRate ) * percentMax
                + this.restHeartRate ;
    }
    
}
