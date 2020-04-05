
public class Main {

    public static void main(String[] args) {


        // Try out your class here
        SimpleCollection c = new SimpleCollection("characters");
        System.out.println("Longest: " + c.longest());
        
        c.add("ichika");
        c.add("nino");
        c.add("miku");
        c.add("yotsuba");
        c.add("itsuki");
        
        System.out.println("Longest: " + c.longest());

        
    }
}
