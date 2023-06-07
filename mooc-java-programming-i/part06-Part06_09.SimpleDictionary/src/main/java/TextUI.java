import java.awt.*;
import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                return;
            } else if (command.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();

                System.out.print("Translation: ");
                String translation = scanner.nextLine();

                dictionary.add(word, translation);
            } else if (command.equals("search")) {
                System.out.print("To be translated: ");
                String word = scanner.nextLine();

                String translation = dictionary.translate(word);

                if (translation == null) {
                    System.out.printf("Word %s was not found", word);
                } else {
                    System.out.println(translation);
                }
            } else {
                System.out.println("Unknown Command");
            }
        }
    }
}
