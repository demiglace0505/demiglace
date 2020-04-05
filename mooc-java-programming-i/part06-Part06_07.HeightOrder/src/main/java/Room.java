
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
public class Room {
    private ArrayList<Person> personList;
    
    public Room(){
        personList = new ArrayList<>();
    }
    
    public void add(Person person){
        this.personList.add(person);
    }
    
    public boolean isEmpty(){
        return (this.personList.isEmpty());
    }
    
    public ArrayList<Person> getPersons(){
        return this.personList;
    }
    
    public Person shortest(){
        if (this.personList.isEmpty()){
            return null;
        }
        Person returnObject = personList.get(0);
        for (Person currentPerson : this.personList) {
            if (returnObject.getHeight() > currentPerson.getHeight()) {
                returnObject = currentPerson;
            }
        }
        return returnObject;
    }
    
    public Person take(){
        Person shortestPerson = shortest();
        this.personList.remove(shortestPerson);
        return shortestPerson;
        
    }
}
