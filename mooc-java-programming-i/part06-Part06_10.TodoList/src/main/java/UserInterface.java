
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
public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;
    
    public UserInterface (TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String inputCommand = scanner.nextLine();
            
            if (inputCommand.equals("stop")){
                break;
            }
            
            if (inputCommand.equals("add")) {
                addCommand();
                continue;
            }
            
            if (inputCommand.equals("list")){
                listCommand();
                continue;
            }
            
            if (inputCommand.equals("remove")) {
                removeCommand();
                continue;
            }
            
        }
    }
    
    public void addCommand(){
        System.out.print("To add: ");
        String task = scanner.nextLine();
        todoList.add(task);
    }
    
    public void listCommand(){
        todoList.print();
    }
    
    public void removeCommand(){
        System.out.print("Which one is removed? ");
        int number = Integer.valueOf(scanner.nextLine());
        todoList.remove(number);
    }
}
