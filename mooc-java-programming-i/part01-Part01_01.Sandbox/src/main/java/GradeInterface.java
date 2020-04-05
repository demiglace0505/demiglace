
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kuchai
 */
public class GradeInterface {

    private GradeRegister register;
    private Scanner scanner;

    public GradeInterface(GradeRegister register, Scanner scanner) {
        this.register = register;
        this.scanner = scanner;
    }

    public void start() {
        readPoints();
        System.out.println("");
        printGradeDistribution();
    }

    public void readPoints() {
        while (true) {
            System.out.print("Points (empty will end): ");
            String input = scanner.nextLine();
            //break
            if (input.equals("")) {
                break;
            }

            int inputPoints = Integer.valueOf(input);
            //check if valid
            if (inputPoints < 0 || inputPoints > 100) {
                System.out.println("Invalid.");
                continue;
            }
            register.addGradeBasedOnPoints(inputPoints);
        }
    }

    public void printGradeDistribution() {
        //loop starting from grade 5, print number of grades
        for (int grade = 5; grade >= 0; grade = grade - 1) {
            int starCount = register.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printStars(starCount);
            System.out.println("");
        }
    }

    public void printStars(int starCount) {
        for (int i = 0; i < starCount; i++) {
            System.out.print("*");
        }
    }

}
