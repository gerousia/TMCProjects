import java.util.ArrayList;

public class Recipe {
    private final String name;
    private final int cookingTime;
    private ArrayList<String> ingredients;

    public Recipe(String name, int time) {
        this.name = name;
        this.cookingTime = time;
        this.ingredients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void addIngredient(String ingredient) {
        this.ingredients.add(ingredient);
    }

    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Recipe)) {
            return false;
        }

        Recipe recipe = (Recipe) compared;

        return this.name.equals(recipe.name);
    }
}
