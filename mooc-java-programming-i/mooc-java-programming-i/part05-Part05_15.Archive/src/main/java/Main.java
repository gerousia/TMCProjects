
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Archive> archives = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();

            if (identifier.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            Archive item = new Archive(identifier, name);
            if (!(archives.contains(item))) {
                archives.add(item);
            }
        }

        for (Archive archive : archives) {
            System.out.printf("%s: %s%n", archive.getIdentifier(), archive.getName());
        }
    }
}
