
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        boolean status = false;

        try (Scanner line = new Scanner(Paths.get(file))) {
            while (line.hasNext()) {
                if (line.next().contains(searchedFor)) {
                    status = true;
                    break;
                }
            }

            if (status) {
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }

        } catch (IOException e) {
            System.out.println("Reading the file " + file + " failed.");
        } finally {
            scanner.close();
        }

    }
}
