
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class ExerciseManagementTest {

    private ExerciseManagement emgmt;
    
    @Before
    public void initialize(){
        emgmt = new ExerciseManagement();
    }

    @Test
    public void exerciseListEmptyAtBeginning() {
        assertEquals(0, emgmt.exerciseList().size());
    }

    @Test
    public void addingExerciseGrowsListByOne() {
        emgmt.add("Ichika");
        assertEquals(1, emgmt.exerciseList().size());
    }

    @Test
    public void addedExerciseIsInList() {
        emgmt.add("New exercise");
        assertTrue(emgmt.exerciseList().contains("New exercise"));
    }
    
    @Test
    public void exerciseCanBeMarkedAsCompleted() {
        emgmt.add("New exercise");
        emgmt.markAsCompleted("New exercise");
        assertTrue(emgmt.isCompleted("New exercise"));
    }
    
    @Test
    public void ifNotMarkedCompletedIsNotCompleted(){
        emgmt.add("New exercise");
        emgmt.markAsCompleted("New exercise");
        assertFalse(emgmt.isCompleted("Some exercise"));
    }
    
    @Test
    public void removeExercise(){
        emgmt.add("Exercise for Removal");
        emgmt.remove("Exercise for Removal");
        assertFalse(emgmt.exerciseList().contains("Exercise for Removal"));
    }
}
