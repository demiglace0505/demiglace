
public class Main {

    public static void main(String[] args) {

        Room myRoom = new Room();
        System.out.println("Empty room? " + myRoom.isEmpty());

        myRoom.add(new Person("ichika", 183));
        myRoom.add(new Person("nino", 182));
        myRoom.add(new Person("miku", 181));
        myRoom.add(new Person("yotsuba", 180));
        myRoom.add(new Person("itsuki", 179));

        System.out.println("Empty room? " + myRoom.isEmpty());

        for (Person currentPerson : myRoom.getPersons()) {
            System.out.println(currentPerson);
        }
        System.out.println("");

        //check shortest person
        System.out.println("Shortest: " + myRoom.take());
        for (Person currentPerson : myRoom.getPersons()) {
            System.out.println(currentPerson);
        }
        System.out.println("");
        
        
    }
}
