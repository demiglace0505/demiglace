
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            //print
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");

            String input = scan.nextLine();
            String[] inputSplit = input.split(" ");
            String inputCommand = inputSplit[0];

            //QUIT
            if (inputCommand.equals("quit")) {
                break;
            }

            //ADD
            if (inputCommand.equals("add")) {
                int amount = Integer.valueOf(inputSplit[1]);
                if (amount < 0) {
                    continue;
                }
                if (firstContainer + amount > 100) {
                    firstContainer = 100;
                    continue;
                }
                firstContainer = firstContainer + amount;
            }

            //MOVE
            if (inputCommand.equals("move")) {
                int amountRequested = Integer.valueOf(inputSplit[1]);
                if (amountRequested < 0) {
                    continue;
                }
                //check if amount left is smaller than requested
                int actualAmount = 0;
                if (firstContainer < amountRequested) {
                    actualAmount = firstContainer;
                    firstContainer = 0;
                    if (secondContainer + actualAmount > 100) {
                        secondContainer = 100;
                    } else {
                        secondContainer = secondContainer + actualAmount;
                    }
                //if requested amount is not smaller than first container
                } else {
                    firstContainer = firstContainer - amountRequested;
                    if (secondContainer + amountRequested > 100) {
                        secondContainer = 100;
                    } else {
                        secondContainer = secondContainer + amountRequested;
                    }
                }
            }
            
            //REMOVE
            if (inputCommand.equals("remove")) {
                int amountRequested = Integer.valueOf(inputSplit[1]);
                if (secondContainer < 0) {
                    continue;
                }
                if (secondContainer < amountRequested) {
                    secondContainer = 0;
                } else {
                    secondContainer = secondContainer - amountRequested;
                }
            }
        }

    }

}
