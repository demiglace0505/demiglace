
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecipeBook recipeBook = new RecipeBook();

        readFromFile(scanner, recipeBook);
        textInterface();
        
        //command selection
        while (true) {
            System.out.print("Enter a command: ");
            String inputCommand = scanner.nextLine();

            if (inputCommand.equals("stop")) {
                break;
            }

            if (inputCommand.equals("list")) {
                listCommand(scanner, recipeBook);
                continue;
            }

            if (inputCommand.equals("find name")) {
                findCommand(scanner, recipeBook);
                continue;
            }

            if (inputCommand.equals("find cooking time")) {
                cookingTimeCommand(scanner, recipeBook);
                continue;
            }

            if (inputCommand.equals("find ingredient")) {
                findIngredientCommand(scanner, recipeBook);
                continue;
            }
        }
    }

    public static void textInterface() {
        System.out.println("");
        System.out.println("Commands: ");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches reicpes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");
    }

    public static void listCommand(Scanner scanner, RecipeBook recipeBook) {
        System.out.println("");
        System.out.println("Recipes:");
        recipeBook.listAllRecipes();
        System.out.println("");
    }

    public static void findCommand(Scanner scanner, RecipeBook recipeBook) {
        System.out.print("Searched word: ");
        String searchName = scanner.nextLine();
        System.out.println("Recipes: ");
        recipeBook.searchForName(searchName);
        System.out.println("");
    }

    public static void cookingTimeCommand(Scanner scanner, RecipeBook recipeBook) {
        System.out.print("Max cooking time: ");
        int maxCookingTime = Integer.valueOf(scanner.nextLine());
        System.out.println("Recipes: ");
        recipeBook.searchForCookTime(maxCookingTime);
        System.out.println("");
    }

    public static void findIngredientCommand(Scanner scanner, RecipeBook recipeBook) {
        System.out.print("Ingredient: ");
        String searchIngredient = scanner.nextLine();
        System.out.println("Recipes: ");
        recipeBook.searchForIngredient(searchIngredient);
        System.out.println("");
    }

    public static void readFromFile(Scanner scanner, RecipeBook recipeBook) {
        //prompt for filename
        System.out.print("File to read: ");
        //recipes.txt
        String fileName = scanner.nextLine();

        try ( Scanner fileScan = new Scanner(Paths.get(fileName))) {

            while (fileScan.hasNextLine()) {
                //separate by recipe, read upto \n\n only
                fileScan.useDelimiter("\n\n");
                String recipeChunk = fileScan.next();

                //split into individual lines
                String[] splitted = recipeChunk.split("\n");
                String name = splitted[0];
                int duration = Integer.valueOf(splitted[1]);

                //convert to arrayList, then remove name and duration
                ArrayList<String> ingredientList = new ArrayList<>(Arrays.asList(splitted));
                ingredientList.remove(name);
                ingredientList.remove(String.valueOf(duration));

                //add recipe to recipeBook
                Recipe recipe = new Recipe(name, duration, ingredientList);
                recipeBook.addRecipe(recipe);
            }
//            recipeBook.printAll();//for test

        } catch (Exception err) {
            System.out.println("Error: " + err);
        }
    }

}
