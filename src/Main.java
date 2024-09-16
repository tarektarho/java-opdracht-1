/**
 * Student Name: Tarek Tarho
 * Opdracht 2
 * Datum: 16-09-2024
 * School: NOVI Hogeschool
 */
public class Main {
    public static void main(String[] args) {
        // Create an ApplePieRecipe object
        ApplePieRecipe applePie = new ApplePieRecipe();

        // Print ingredients
        System.out.println("Ingredients:");
        applePie.printIngredients();

        // Print recipe steps
        System.out.println("\nRecipe Steps:");
        applePie.printRecipe();
    }
}
