
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//PART 1: AVERAGE GRADE
//        GradeRegister register = new GradeRegister();
//        register.addGradeBasedOnPoints(93);
//        register.addGradeBasedOnPoints(91);
//        register.addGradeBasedOnPoints(92);
//        register.addGradeBasedOnPoints(88);
//
//        System.out.println(register.averageOfGrades());

//PART 2: AVERAGE POINTS        
//        GradeRegister register = new GradeRegister();
//        register.addGradeBasedOnPoints(93);
//        register.addGradeBasedOnPoints(91);
//        register.addGradeBasedOnPoints(92);
//
//        System.out.println(register.averageOfPoints());

//PART 3: PRINTS IN THE USER INTERFACE
        GradeRegister register = new GradeRegister();
        UserInterface ui = new UserInterface(register, scanner);
        ui.start();
    }
}
