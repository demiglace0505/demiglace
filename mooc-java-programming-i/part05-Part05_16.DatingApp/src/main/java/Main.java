
public class Main {

    public static void main(String[] args) {
        // test your program here!
        SimpleDate date = new SimpleDate(27,12,2005);
        
        System.out.println(date); //27 12 2005
        date.advance();
        System.out.println(date); //28 12 2005
        date.advance(2);
        System.out.println(date); //30 12 2005
        
        SimpleDate newDate = date.afterNumberOfDays(7);
        System.out.println(newDate); //7 1 2006
        System.out.println(date); //30 12 2005
    }
}
