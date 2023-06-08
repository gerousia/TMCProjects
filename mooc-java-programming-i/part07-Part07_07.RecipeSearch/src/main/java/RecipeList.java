import java.util.ArrayList;

public class RecipeList {
    private ArrayList<Recipe> recipes;

    public RecipeList() {
        this.recipes = new ArrayList<>();
    }

    public void addRecipe(String name, int cookingTime) {
        this.recipes.add(new Recipe(name, cookingTime));
    }

    public void addRecipe(Recipe recipe) {
        this.recipes.add(recipe);
    }

    public void addRecipeIngredient(Recipe toAdd, String ingredient) {
        for (Recipe recipe : this.recipes) {
            if (recipe.equals(toAdd) && !recipe.getIngredients().contains(ingredient)) {
                recipe.addIngredient(ingredient);
            }
        }
    }

    public void containsRecipe(String name) {
        System.out.println("Recipes: ");
        for (Recipe recipe : this.recipes) {
            if (recipe.getName().contains(name)) {
                System.out.printf("%s, cooking time: %d%n", recipe.getName(), recipe.getCookingTime());
            }
        }
    }

    public void containsCookingTime(int time) {
        System.out.println("Recipes: ");
        for (Recipe recipe : this.recipes) {
            if (recipe.getCookingTime() <= time) {
                System.out.printf("%s, cooking time: %d%n", recipe.getName(), recipe.getCookingTime());
            }
        }
    }

    public void containsIngredient(String ingredient) {
        for (Recipe recipe : this.recipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.printf("%s, cooking time: %d%n", recipe.getName(), recipe.getCookingTime());
            }
        }
    }

    public void printAllIngredients() {
        for (Recipe recipe : this.recipes) {
            System.out.printf("%s, cooking time: %d%n", recipe.getName(), recipe.getCookingTime());
            System.out.println(recipe.getIngredients());
        }
    }


    public void printAllRecipes() {
        System.out.println("Recipes: ");
        for (Recipe recipe : this.recipes) {
            System.out.printf("%s, cooking time: %d%n", recipe.getName(), recipe.getCookingTime());
        }
    }

}
