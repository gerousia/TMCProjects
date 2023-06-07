
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try (Scanner line = new Scanner(Paths.get(file))) {
            while (line.hasNextLine()) {
                String[] array = line.nextLine().split(",");
                System.out.println(array[0] + ", age: " + array[1] + (Integer.valueOf(array[1]) == 1 ? " year" : " years"));
            }
        } catch (IOException e) {
            System.out.println("Error: " + file + " not found.");
        } finally {
            scanner.close();
        }
    }
}
