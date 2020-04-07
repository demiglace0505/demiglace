
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
public class RecipeBook {
    private ArrayList<Recipe> recipeList;
    
    public RecipeBook(){
        recipeList = new ArrayList<>();
    }
    
    public void addRecipe(Recipe recipe){
        recipeList.add(recipe);
    }
    
    public void listAllRecipes(){
        for (Recipe currentRecipe : this.recipeList) {
            System.out.println(currentRecipe);
        }
    }
    
    public void searchForName(String searchName){
        for (Recipe currentRecipe : this.recipeList){
            currentRecipe.searchRecipeName(searchName);
        }
    }
    
    public void searchForCookTime(int maxCookTime){
        for (Recipe currentRecipe : this.recipeList) {
            currentRecipe.searchRecipeCookTime(maxCookTime);
        }
    }
    
    public void searchForIngredient(String searchIngredient){
        for (Recipe currentRecipe : this.recipeList) {
            currentRecipe.searchRecipeIngredient(searchIngredient);
        }
    }

    public void printAll(){
        for (Recipe currentRecipe : recipeList){
            System.out.println(currentRecipe.toString());
        }
    }
    
    
}
