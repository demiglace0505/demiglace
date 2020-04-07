
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Points pointList = new Points();
        
        System.out.println("Enter points, -1 stops:");
        while (true) {
            int inputPoint = Integer.valueOf(scanner.nextLine());
            if (inputPoint == -1){
                break;
            }
            pointList.add(inputPoint);
            
        }
//PART 1 point avera
        System.out.println("Point average (all): " + pointList.averageAll());
//PART 2
        System.out.println("Point average (passing): " + pointList.averagePassing());
//PART 3
        System.out.println("Pass percentage: " + pointList.passerPercentage());
//PART 4
        pointList.printDist();
        
    }
}
