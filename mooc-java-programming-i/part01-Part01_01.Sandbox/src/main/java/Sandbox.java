
import java.util.ArrayList;
import java.util.Scanner;

public class Sandbox {

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        
        Person ichika = new Person("Ichika", 5, 5, 1990);
        System.out.println(ichika);

        SimpleDate date = new SimpleDate(5,5,1991);
        Person nino = new Person("Nino", date);
        System.out.println(nino);
        
        System.out.println("Ichika older than Nino? " + ichika.olderThan(nino));

        SimpleDate p1 = new SimpleDate(1, 1, 2000);
        SimpleDate p2 = new SimpleDate(1, 1, 2000);
        SimpleDate p3 = new SimpleDate(12, 12, 2012);
        SimpleDate p4 = p1;
        
        if (p1.equals(p1)) {
            System.out.println("variables p1 and p1 are equal");
        } else {
            System.out.println("variables p1 and p1 are NOT equal");
        }
        
        if (p1.equals(p2)) {
            System.out.println("variables p1 and p2 are equal");
        } else {
            System.out.println("variables p1 and p2 are NOT equal");
        }
        
        if (p1.equals(p3)) {
            System.out.println("variables p1 and p3 are equal");
        } else {
            System.out.println("variables p1 and p3 are NOT equal");
        }
        
        if (p1.equals(p4)) {
            System.out.println("variables p1 and p4 are equal");
        } else {
            System.out.println("variables p1 and p4 are NOT equal");
        }
        

    }

}
