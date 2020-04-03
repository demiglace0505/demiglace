
public class Main {

    public static void main(String[] args) {
        // write experimental code here to check how your program functions

        HealthStation hospital = new HealthStation();

        Person ethan = new Person("Ethan", 1, 110, 7);
        Person peter = new Person("Peter", 33, 176, 85);

        System.out.println("weighings performed: " + hospital.weighings());

        hospital.weigh(ethan);
        hospital.weigh(peter);

        System.out.println("weighings performed: " + hospital.weighings());

        hospital.weigh(ethan);
        hospital.weigh(ethan);
        hospital.weigh(ethan);
        hospital.weigh(ethan);

        System.out.println("weighings performed: " + hospital.weighings());

    }
}
