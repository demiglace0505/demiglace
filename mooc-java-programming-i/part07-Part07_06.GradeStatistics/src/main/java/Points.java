
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kuchai
 */
public class Points {

    private ArrayList<Integer> allPointsList;
    private ArrayList<Integer> passingPointsList;
    private ArrayList<Integer> gradeList;

    public Points() {
        this.allPointsList = new ArrayList<>();
        this.passingPointsList = new ArrayList<>();
        this.gradeList = new ArrayList<>();
    }

    public void add(int points) {
        if (100 >= points && points >= 0) {
            this.allPointsList.add(points);
            if (points >= 50) {
                this.passingPointsList.add(points);
            }
            //convert point to corresponding grade
            this.gradeList.add(pointsToGrade(points));
        }
    }

    public int sumAll() {
        int sum = 0;
        for (Integer currentPoint : this.allPointsList) {
            sum = sum + currentPoint;
        }
        return sum;
    }

    public int sumPassing() {
        int sum = 0;
        for (Integer currentPoint : this.passingPointsList) {
            sum = sum + currentPoint;
        }
        return sum;
    }

    public double averageAll() {
        return 1.0 * this.sumAll() / this.allPointsList.size();
    }

    public String averagePassing() {

        if (this.passingPointsList.isEmpty()) {
            return "-";
        }
        double average = 1.0 * this.sumPassing() / this.passingPointsList.size();
        return String.valueOf(average);
    }

    public double passerPercentage() {
        return 100.0 * this.passingPointsList.size() / this.allPointsList.size();
    }

    public int pointsToGrade(int point) {
        int grade = 0;
        if (point < 50) {
            grade = 0;
        } else if (point < 60) {
            grade = 1;
        } else if (point < 70) {
            grade = 2;
        } else if (point < 80) {
            grade = 3;
        } else if (point < 90) {
            grade = 4;
        } else {
            grade =5;
        }
        return grade;
    }
    
    public int numberOfThisGrade(int grade){
        //count number of instance of a grade in gradeList
        int counter = 0;
        for (int currentGrade : this.gradeList){
            if (currentGrade == grade){
                counter++;
            }
        }
        return counter;
    }
    
    public void printStars(int starCount){
        for (int i = 0; i < starCount ; i++){
            System.out.print("*");
        }
    }
    
    public void printDist () {
        System.out.println("Grade distribution: ");
        for (int grade =5 ; grade >= 0 ; grade = grade - 1) {
            int starCount = numberOfThisGrade(grade);
            System.out.print(grade + ": ");
            printStars(starCount);
            System.out.println("");
        }
    }

    @Override
    public String toString() {
        return "All: " + this.allPointsList.toString()
                + "\n Passing: " + this.passingPointsList.toString();
    }

}
