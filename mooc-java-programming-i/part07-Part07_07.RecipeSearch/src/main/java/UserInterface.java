import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private RecipeList recipes;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.recipes = new RecipeList();
    }

    public void start() {

        System.out.println("File to read: ");
        String fileName = scanner.nextLine();

        System.out.println();
        System.out.println("Commands: ");
        System.out.println("list - list the recipes");
        System.out.println("stop - stops the program");
        System.out.println();

        readFile(fileName);

        while (true) {

            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                return;
            } else if (command.equals("list")) {
                System.out.println();
                recipes.printAllRecipes();
                System.out.println();

            } else if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String word = scanner.nextLine();

                System.out.println();
                recipes.containsRecipe(word);
                System.out.println();

            } else if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int time = Integer.valueOf(scanner.nextLine());

                System.out.println();
                recipes.containsCookingTime(time);
                System.out.println();

            } else if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();

                System.out.println();
                recipes.containsIngredient(ingredient);
                System.out.println();
            }
        }
    }

    private void readFile(String file) {
        try (Scanner line = new Scanner(Paths.get(file))) {
            while (line.hasNextLine()) {
                Recipe recipe = new Recipe(line.nextLine(), Integer.valueOf(line.nextLine()));
                recipes.addRecipe(recipe);

                while (line.hasNextLine()) {
                    String ingredient = line.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    recipes.addRecipeIngredient(recipe, ingredient);
                }
            }
        } catch (IOException e) {
            System.out.println("ERROR: " + file + " not found.");
        }
    }
}
