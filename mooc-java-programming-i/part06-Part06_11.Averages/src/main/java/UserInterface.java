
import java.util.Scanner;

public class UserInterface {

    private GradeRegister register;
    private Scanner scanner;

    public UserInterface(GradeRegister register, Scanner scanner) {
        this.register = register;
        this.scanner = scanner;
    }

    public void start() {
        readPoints();
        System.out.println("");
        printGradeDistribution();
        printAveragePoints();
        printAverageGrades();
    }

    public void readPoints() {
        while (true) {
            System.out.print("Points: ");
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            int points = Integer.valueOf(input);

            if (points < 0 || points > 100) {
                System.out.println("Impossible number.");
                continue;
            }

            this.register.addGradeBasedOnPoints(points);
        }
    }

    public void printGradeDistribution() {
        for (int grade = 5; grade >= 0; grade = grade - 1) {
            int stars = register.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printsStars(stars);
            System.out.println("");
        }
    }

    public static void printsStars(int stars) {
        for (int i = 0; i < stars; i++) {
            System.out.print("*");
        }
    }

    public void printAveragePoints() {
        System.out.println("The average of points: " + register.averageOfPoints());
    }

    public void printAverageGrades() {
        System.out.println("The average of grades: " + register.averageOfGrades());
    }
}
