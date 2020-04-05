
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        
        Package giftPackage = new Package();
        Gift book = new Gift("Harry Potter and the Philosopher's Stone" , 2);
        System.out.println("Gift's name: " + book.getName());
        System.out.println("Gift's weight: " + book.getWeight());
        
        System.out.println("Gift: " + book);
        
        Gift TV = new Gift("Sony TV", 10);
        
        giftPackage.addGift(book);
        giftPackage.addGift(TV);
        System.out.println(giftPackage.totalWeight());
        

        
    }
}
