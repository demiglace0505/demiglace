
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
public class TodoList {
    private ArrayList<String> taskList;
    
    public TodoList(){
        taskList = new ArrayList<>();
    }
    
    public void add(String task){
        this.taskList.add(task);
    }
    
    public void print(){
        for (String currentTask : taskList) {
            System.out.println( (taskList.indexOf(currentTask) + 1) + ": " +currentTask  );
        }
    }
    
    public void remove (int number){
        taskList.remove(number - 1);
    }
}
