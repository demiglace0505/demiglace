
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        for (int value : array){
            printStars(value);
            System.out.println("");
        }
        
    }
    
    public static void printStars(int amount){
        while (amount > 0){
            System.out.print("*");
            amount = amount - 1;
        }
    }
}
