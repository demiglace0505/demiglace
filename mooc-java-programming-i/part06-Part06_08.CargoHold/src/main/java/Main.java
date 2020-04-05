
public class Main {

    public static void main(String[] args) {
        Item book = new Item("The lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("Brick" , 4);

        System.out.println("The book's name: " + book.getName());
        System.out.println("The book's weight: " + book.getWeight());
        System.out.println("");

        System.out.println("Book: " + book);
        System.out.println("Phone: " + phone);
        System.out.println("");

        Suitcase ichikaSuitcase = new Suitcase(10);
        System.out.println(ichikaSuitcase);
        ichikaSuitcase.addItem(book);
        ichikaSuitcase.addItem(phone);
        ichikaSuitcase.addItem(brick);
        System.out.println(ichikaSuitcase);
        System.out.println("");
        
        System.out.println("The suitcase contains the following items: ");
        ichikaSuitcase.printItems();
        System.out.println("Total weight: " + ichikaSuitcase.totalWeight() + " kg");
        
        //look for heaviest item
        System.out.println("Heaviest item: " + ichikaSuitcase.heaviestItem());
        
        //part 6
        Suitcase mikuSuitcase = new Suitcase(10);
        mikuSuitcase.addItem(brick);
        
        Hold handHold = new Hold(500);
        handHold.addSuitcase(mikuSuitcase); //4kg
        handHold.addSuitcase(ichikaSuitcase); //7kg
        
        System.out.println(handHold);
        
        System.out.println("The suitcases in the hold contain the following items:");
        handHold.printItems();
    }

}
