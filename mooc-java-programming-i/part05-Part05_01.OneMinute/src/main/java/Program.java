
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        // You can test your program here
        Timer myTimer = new Timer();

        while (true) {
            System.out.println(myTimer);
            myTimer.advance();
            
            try {
                Thread.sleep(10);
            } catch (Exception err) {
                System.out.println(err);
            }
        }

    }
}
