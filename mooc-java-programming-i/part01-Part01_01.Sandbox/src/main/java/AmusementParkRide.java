
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
public class AmusementParkRide {

    private String rideName;
    private int minHeight;
    private int visitors;
    private ArrayList<Person> currentlyRiding;

    public AmusementParkRide(String rideName, int minHeight) {
        this.rideName = rideName;
        this.minHeight = minHeight;
        this.visitors = 0;
        this.currentlyRiding = new ArrayList<>();
    }

    public String toString() {
        //print output
        String printOut = this.rideName + ", min height: " + this.minHeight + ", visitor count: "
                + this.visitors + "\n";

        //check if there is a rider
        if (currentlyRiding.isEmpty()) {
            return printOut + "no one is riding";
        }

        //variable for persons in the ride
        String onTheRide = "";

        for (Person personRiding : currentlyRiding) {
            onTheRide = onTheRide + personRiding.getName() + "\n";
        }

        return printOut + "\n" + "people currently riding: \n" + onTheRide;
    }

    public boolean allowedToRide(Person rider) {
        if (rider.getHeight() < this.minHeight) {
            return false;
        } else {
            this.visitors++;
            this.currentlyRiding.add(rider);
            return true;
        }
    }
    
    public void removeRiders(){
        this.currentlyRiding.clear();
    }
    
    public double averageHeightofRiders(){
        if (currentlyRiding.isEmpty()) {
            return -1;
        }
        int sumHeight = 0;
        for (Person currentPerson : currentlyRiding) {
            sumHeight = currentPerson.getHeight() + sumHeight;
        }
        
        return 1.0 * sumHeight / currentlyRiding.size();
    }
    
    public Person getTallest(){
        if (this.currentlyRiding.isEmpty()) {
            return null;
        }
        Person returnObject = this.currentlyRiding.get(0);
        for (Person currentPerson : this.currentlyRiding ){
            if (returnObject.getHeight() < currentPerson.getHeight()) {
                returnObject = currentPerson;
            }
        }
        return returnObject;
    }

}
