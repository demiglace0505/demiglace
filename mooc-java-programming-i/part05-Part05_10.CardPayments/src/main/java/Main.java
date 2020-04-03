
public class Main {

    public static void main(String[] args) {
        //PART 1
//        PaymentCard ichikaCard = new PaymentCard(10);
//        
//        System.out.println("money " + ichikaCard.balance());
//        boolean successfulTransaction = ichikaCard.takeMoney(8);
//        System.out.println("successfully withdrew: " + successfulTransaction);
//        System.out.println("money " + ichikaCard.balance());
//        
//        successfulTransaction = ichikaCard.takeMoney(4);
//        System.out.println("successfully withdrew: " + successfulTransaction);
//        System.out.println("money " + ichikaCard.balance());
        
        //PART 2
//        PaymentTerminal cashier = new PaymentTerminal();
//        
//        double change = cashier.eatAffordably(10);
//        System.out.println("remaining change " + change);
//        
//        change = cashier.eatAffordably(5);
//        System.out.println("remaining change " + change);
//        
//        change = cashier.eatHeartily(4.3);
//        System.out.println("remaining change " + change);
//        
//        System.out.println(cashier);
        
//        //PART 3
//        PaymentTerminal cashier = new PaymentTerminal();
//        
//        //Pay using cash
//        double change = cashier.eatAffordably(10);
//        System.out.println("remaining change: " + change);
//        
//        PaymentCard mikuCard = new PaymentCard(7);
//        //pay using card
//        boolean transactionSuccessful = cashier.eatHeartily(mikuCard);
//        System.out.println("there was enough money: " + transactionSuccessful);
//                
//        transactionSuccessful = cashier.eatHeartily(mikuCard);
//        System.out.println("there was enough money: " + transactionSuccessful);
//                
//        transactionSuccessful = cashier.eatAffordably(mikuCard);
//        System.out.println("there was enough money: " + transactionSuccessful);
//                
//        System.out.println(cashier);

        //PART 4
        
        PaymentTerminal cashier = new PaymentTerminal();
        System.out.println(cashier);
        
        PaymentCard yotsubaCard = new PaymentCard(2);
        System.out.println("amount of money on the card is " + yotsubaCard.balance() + " euros");
        
        boolean transactionSuccessful = cashier.eatHeartily(yotsubaCard);
        System.out.println("there was enough money: " + transactionSuccessful);
        
        cashier.addMoneyToCard(yotsubaCard, 100);
        
        transactionSuccessful = cashier.eatHeartily(yotsubaCard);
        System.out.println("there was enough money: " + transactionSuccessful);
        
        System.out.println("amount of money on the card is " + yotsubaCard.balance() + " euros");
        
        System.out.println(cashier);
        
    }
}

