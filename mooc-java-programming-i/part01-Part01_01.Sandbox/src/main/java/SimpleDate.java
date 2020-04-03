/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kuchai
 */
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        //return true if parameter date is after date of object called
        //compare year
        if (this.year < compared.year) {
            return true;
        }

        if (this.year > compared.year) {
            return false;
        }

        //compare months
        if (this.month < compared.month) {
            return true;
        }

        if (this.month > compared.month) {
            return false;
        }

        //compare days
        if (this.day < compared.day) {
            return true;
        } else {
            return false;
        }

    }

    public boolean equals(Object compared) {
        //if variables are located in same position, they are equal
        if (this==compared){
            return true;
        }
        //if type of the compared object is not of SimpleDate, objects are not equal
        if (!(compared instanceof SimpleDate)) {
            return false;
        }
        
        //convert object type of compared object into SimpleDate type object called comparedSimpleDate
        SimpleDate comparedSimpleDate = (SimpleDate) compared;
        
        //if the values of the object variable are same, objects are equal
        if (this.day == comparedSimpleDate.day &&
            this.month == comparedSimpleDate.month &&
            this.year == comparedSimpleDate.year) {
            return true;
        }
        
        //otherwise objects not equal
        return false;
    }
}
