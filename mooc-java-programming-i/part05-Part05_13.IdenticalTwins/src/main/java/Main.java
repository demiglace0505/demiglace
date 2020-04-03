
public class Main {

    public static void main(String[] args) {
     SimpleDate date = new SimpleDate (5,5,2015);
     SimpleDate date2 = new SimpleDate (5,5,2005);

     Person ichika = new Person("Ichika", date, 160, 50);
     Person nino = new Person("Nino", date, 160, 50);
     
     if (ichika.equals(nino)) {
         System.out.println("Equal");
     } else {
         System.out.println("Not equal");
     }
        
    }
}
