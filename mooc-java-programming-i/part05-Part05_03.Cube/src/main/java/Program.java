
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cube myFirstCube = new Cube(4);
        System.out.println(myFirstCube.volume());
        System.out.println(myFirstCube);
        
        System.out.println("");
        
        Cube mySecondCube = new Cube(2);
        System.out.println(mySecondCube.volume());
        System.out.println(mySecondCube);
        
    }
}
