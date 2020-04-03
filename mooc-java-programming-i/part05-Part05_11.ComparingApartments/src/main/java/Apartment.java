
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        } else {
            return false;
        }
    }

    public int priceDifference(Apartment compared) {
        if ((this.totalPrice() - compared.totalPrice()) < 0) {
            return (this.totalPrice() - compared.totalPrice()) * -1;
        } else {
            return (this.totalPrice() - compared.totalPrice());
        }

    }
    
    public boolean moreExpensiveThan(Apartment compared){
        if ( this.totalPrice() > compared.totalPrice()  ){
            return true;
        } else {
            return false;
        }
    }

    public int totalPrice() {
        return this.squares * this.pricePerSquare;
    }

}
