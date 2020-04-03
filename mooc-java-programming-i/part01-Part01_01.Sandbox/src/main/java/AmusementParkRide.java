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

    public AmusementParkRide(String rideName, int minHeight) {
        this.rideName = rideName;
        this.minHeight = minHeight;
    }

    public String toString() {
        return this.rideName + ", minimmum height: " + this.minHeight;
    }

    public boolean allowedToRide(Person rider) {
        if (rider.getHeight() < this.minHeight) {
            return false;
        } else {
            return true;
        }
    }

}
