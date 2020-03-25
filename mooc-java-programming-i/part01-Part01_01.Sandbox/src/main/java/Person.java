/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kuchai
 */
public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;
    
    public Person(String initialName, int initialAge){
        this.age = initialAge;
        this.name = initialName;
        this.weight = 0;
        this.height = 0;
    }
    
    public void setHeight(int newHeight){
        this.height = newHeight;
    }
    
    public void setWeight(int newWeight){
        this.weight = newWeight;
    }
    
    public double bodyMassIndex(){
        double heightPerHundred = this.height/100.0;
        return this.weight / (heightPerHundred * heightPerHundred);
    }
    
    public void printPerson(){
        System.out.println(this.name + ", age " + this.age + " years");
    }
    
    public void growOlder(){
        this.age = this.age + 1;
    }
    
    public int returnAge() {
        return this.age;
    }
    
    public String getName() {
        return this.name;
    }
    
    public boolean isOfLegalAge(){
        if (this.age >= 18) {
            return true;
        }
        return false;
    }
    
    public String toString() {
        return this.name + ", age " + this.age + " years";
    }
    
    public int getAge(){
        return this.age;
    }
    
    
}


