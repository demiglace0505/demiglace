
public class Sandbox {

    public static void main(String[] args) {
        // Write your program here
        Person ichika = new Person("Ichika");
        Person nino = new Person("Nino");
        Person miku = new Person("Miku");
        Person yotsuba = new Person("Yotsuba");
        Person itsuki = new Person("Itsuki");

        ichika.printPerson();
        nino.printPerson();
        miku.printPerson();
        yotsuba.printPerson();
        itsuki.printPerson();

        ichika.growOlder();
        ichika.growOlder();

        for (int i = nino.returnAge(); i < 20; i++) {
            nino.growOlder();
        }
        
        nino.setHeight(159);
        nino.setWeight(50);
        
        System.out.println("");
        System.out.println("Using toString:");
        System.out.println(nino);

        System.out.println("Using getName():");
        if (ichika.isOfLegalAge()) {
            System.out.print(ichika.getName() + " is of legal age");
        } else {
            System.out.print(ichika.getName() + " is underage");
        }

        System.out.println("");

        if (nino.isOfLegalAge()) {
            System.out.print(nino.getName() + " is of legal age: ");
        } else {
            System.out.print(nino.getName() + " is underage");
        }
        System.out.println("");
        
        //BMI
        itsuki.setWeight(50);
        itsuki.setHeight(159);
        
        System.out.println(itsuki.getName() + ", BMI is " + itsuki.bodyMassIndex());
    }
}
