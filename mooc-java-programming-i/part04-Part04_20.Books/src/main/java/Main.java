import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> myBook = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Title: ");
            String inputName = scanner.nextLine();
            if (inputName.isEmpty()) {
                break;
            }
            System.out.print("Pages: ");
            int inputPage = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int inputYear = Integer.valueOf(scanner.nextLine());
                       
            myBook.add(new Book(inputName, inputPage, inputYear));
        }
        
        System.out.println("");
        System.out.print("What information will be printed? ");
        String filter = scanner.nextLine();
        
        if (filter.equals("name")) {
            for (Book currentBook : myBook) {
                System.out.println(currentBook.getTitle());
            }
        } else if (filter.equals("everything")) {
            for (Book currentBook : myBook) {
                System.out.println(currentBook);
            }
        }
        

    }
}
