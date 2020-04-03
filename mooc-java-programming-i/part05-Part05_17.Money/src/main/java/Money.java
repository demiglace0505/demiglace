
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);
        return newMoney;
    }
    
    public Money minus (Money decrease) {
        if (this.euros - decrease.euros < 0) {
            Money newMoney = new Money(0, 0);
            return newMoney;
        }
        if (this.cents < decrease.cents) {
            Money newMoney = new Money (this.euros - decrease.euros - 1, (this.cents +100 - decrease.cents) );
            return newMoney;
        }
        
        Money newMoney = new Money(this.euros - decrease.euros , this.cents - decrease.cents);
        return newMoney;
    }
    
    public boolean lessThan(Money compared) {
        if (this.euros == compared.euros) {
            if (this.cents < compared.cents) {
                return true;
            }
        }
        if (this.euros < compared.euros) {
            return true;
        }
        return false;
    }
    
    

}
