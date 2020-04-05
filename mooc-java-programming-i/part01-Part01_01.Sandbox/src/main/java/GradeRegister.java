
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
public class GradeRegister {

    private ArrayList<Integer> gradeList;

    public GradeRegister() {
        this.gradeList = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.gradeList.add(pointsToGrades(points));
    }
    
    public int numberOfGrades(int grade){
        //count how many grades (ex how many 5s)
        int count = 0;
        for (int currentGrade : this.gradeList){
            if (currentGrade == grade){
                count++;
            }
        }
        return count;
    }

    public static int pointsToGrades(int points) {
        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }
        return grade;
    }

}
