
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Searching {

    public static void main(String[] args) {
        // The program below is meant for testing the search algorithms you'll write
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        System.out.println("How many books to create?");
        int numberOfBooks = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < numberOfBooks; i++) {
            books.add(new Book(i, "name for the book " + i));
        }

        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.valueOf(scanner.nextLine());

        System.out.println("");
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        System.out.println("");

        System.out.println("");
        System.out.println("Seaching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }

    }

    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        for (Book currentBook : books) {
            if (currentBook.getId() == searchedId) {
                return books.indexOf(currentBook);
            }
        }
        //not found
        return -1;
    }

    public static int binarySearch(ArrayList<Book> books, long searchedId) {
//PSEUDO CODE
// assuming the variable searched exits
// assuming the variable list exits
//begin = 0 // the 0th index of the list (i.e, the first index of the list)
//end = size(list) - 1 // the last index in the list
//
//repeat until begin is larger than end:
//    middle = (end + begin) / 2
//
//    if the value at list[middle] is searched
//        return the value of the variable middle
//
//    if the value at list[middle] is smaller than searched
//        begin = middle + 1
//
//    if the value at list[keski] is larger than searched
//        end = middle - 1
//
//return value -1

        ArrayList<Book> bookList = books;
        //index range initialize
        int startpoint = 0;
        int endpoint = books.size() - 1;

        while (startpoint <= endpoint) {
            int midpoint = (startpoint + endpoint) / 2;
            
            //found
            if (searchedId == books.get(midpoint).getId()) {
                return books.indexOf(books.get(midpoint));
            }
            if (searchedId > books.get(midpoint).getId()) {
                startpoint = midpoint + 1;
                continue;
            }
            if (searchedId < books.get(midpoint).getId()) {
                endpoint = midpoint - 1;
                continue;
            }
        }
        //fail when start < end
        return -1;
    }
}
