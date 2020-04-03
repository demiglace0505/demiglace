
public class MainProgram {

    public static void main(String[] args) {
        // test your class here
        Money a = new Money(10, 40);
        Money b = new Money(5, 70);

        Money c = a.plus(b);

        System.out.println(a);  // 10.40e
        System.out.println(b);  // 5.70e
        System.out.println(c);  // 16.10e

        a = a.plus(c);          

        System.out.println(a);  // 26.50e
        System.out.println(b);  // 5.70e
        System.out.println(c);  // 16.10e
        
        System.out.println(a.lessThan(b)); //false
        System.out.println(b.lessThan(c)); //true
        
        c = c.minus(b);
        System.out.println(c); //10.40
        
        b = b.minus(a);
        System.out.println(b); //0.00

    }
}
