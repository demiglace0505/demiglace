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
    private SimpleDate birthday;
    private int weight;
    private int height;

    public Person(String name, SimpleDate date) {
        this.name = name;
        this.birthday = date;
    }

    public Person(String name, int day, int month, int year) {
        this.name = name;
        this.birthday = new SimpleDate(day, month, year);
    }

    public SimpleDate getBirthday() {
        return this.birthday;
    }

    public Person(String name) {
        this(name, 0, 0, 0);
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double bodyMassIndex() {
        double heightPerHundred = this.height / 100.0;
        return this.weight / (heightPerHundred * heightPerHundred);
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + " born on" + this.birthday;
    }

    public boolean olderThan(Person compared) {
        if (this.birthday.before(compared.getBirthday())) {
            return true;
        }
        else {
            return false;
        }
       
    }
    
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        } 
        if (!(compared instanceof Person)) {
            return false;
        }
        
        //convert the object compared into Person object
        Person comparedPerson = (Person) compared;
        
        if (this.name.equals(comparedPerson.name) &&
                this.weight == comparedPerson.weight &&
                this.height == comparedPerson.height) {
            return true;
        }
        return false;
    }

}
