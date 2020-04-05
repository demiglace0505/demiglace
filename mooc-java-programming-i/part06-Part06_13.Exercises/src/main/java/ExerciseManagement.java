
import java.util.ArrayList;

public class ExerciseManagement {

    private ArrayList<Exercise> exerciseList;

    public ExerciseManagement() {
        this.exerciseList = new ArrayList<>();
    }

    public ArrayList<String> exerciseList() {
        ArrayList<String> list = new ArrayList<>();
        for (Exercise currentExercise : exerciseList ) {
            list.add(currentExercise.getName());
        }
        return list;
    }

    public void add(String exercise) {
        this.exerciseList.add(new Exercise(exercise));
    }
    
    public void remove(String exercise){
        //check if exercise exists
        for (Exercise currentExercise: exerciseList) {
            if (currentExercise.getName().equals(exercise)){
                this.exerciseList.remove(currentExercise);
                break;
            }
        }
        
    }

    public void markAsCompleted(String exercise) {
        //check exerciseList for an exercise with same name as exercise(string)
        for (Exercise currentExercise : exerciseList) {
            if (currentExercise.getName().equals(exercise)){
                currentExercise.setCompleted(true);
            }
        }
    }

    public boolean isCompleted(String exercise) {
        for (Exercise currentExercise: exerciseList) {
            if (currentExercise.getName().equals(exercise)){
                return currentExercise.isCompleted();
            }
        }
        return false;
    }
}
