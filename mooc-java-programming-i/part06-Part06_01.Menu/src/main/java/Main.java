
public class Main {

    public static void main(String[] args) {
        Menu myMenu = new Menu();
        
        myMenu.addMeal("Tofu ratatouille");
        myMenu.addMeal("Chilli coconut chicken");
        myMenu.addMeal("Chilli coconut chicken");
        myMenu.addMeal("Meatballs with mustard sauce");
        
        myMenu.printMeals();
        myMenu.clearMenu();
        
        System.out.println("");
        myMenu.addMeal("Tomato and mozzarella salad");
        myMenu.printMeals();

//        exactum.addMeal("Smoked salmon, white wine and butter sauce with basil");
//        exactum.addMeal("Seasonal green salad with apple-honey vinegarette");
//        exactum.addMeal("Roasted lamb in a red wine sauce");
        // When you have completed the method printMeals()
        // you can remove the comment below
//        exactum.printMeals();
        // When you have completed the method clearMenu()
        // you can remove the comments below
//        exactum.clearMenu();
//        exactum.printMeals();
    }
}
