
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
public class Recipe {
    private String name;
    private int cookTime;
    private ArrayList<String> ingredients;
    
    public Recipe(String name, int cookTime, ArrayList<String> ingredients) {
        this.name = name;
        this.cookTime = cookTime;
        this.ingredients = ingredients;
    }

    public void setIngredientsList(ArrayList<String> ingredientsList) {
        this.ingredients = ingredientsList;
    }

    public void setCookTime(int cookTime) {
        this.cookTime = cookTime;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void listRecipe() {
        System.out.println(this.name + ", cooking time: " + this.cookTime);
    }
    
    public void searchRecipeName(String searchName){
        if (this.name.contains(searchName)) {
            System.out.println(this);
        }
    }
    
    public void searchRecipeCookTime(int maxCookTime) {
        if (this.cookTime <= maxCookTime) {
            System.out.println(this);
        }
    }
    
    public void searchRecipeIngredient(String searchIngredient) {
        if (this.ingredients.contains(searchIngredient)) {
            System.out.println(this);
        }
    }

    @Override
    public String toString() {
        return (this.name + ", cooking time: " + this.cookTime);
    }
}
