
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> gradeList;
    private ArrayList<Integer> pointList;

    public GradeRegister() {
        this.gradeList = new ArrayList<>();
        this.pointList = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.gradeList.add(pointsToGrade(points));
        this.pointList.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.gradeList) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

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

    public double averageOfGrades() {
        if (gradeList.isEmpty()) {
            return -1;
        }
        int sum = 0;
        for (int currentGrade : gradeList) {
            sum = sum + currentGrade;
        }
        return 1.0 * sum / gradeList.size();
    }
    
    public double averageOfPoints(){
        if (pointList.isEmpty()) {
            return -1;
        }
        int sum = 0;
        for (int currentPoint : pointList) {
            sum = sum + currentPoint;
        }
        return 1.0 * sum / pointList.size();
    }
}
