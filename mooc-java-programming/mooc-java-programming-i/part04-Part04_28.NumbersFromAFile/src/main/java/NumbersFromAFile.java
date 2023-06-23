
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        int numbers = 0;
        try (Scanner line = new Scanner(Paths.get(file))) {

            while (line.hasNext()) {
                int number = Integer.parseInt(line.next());
                if (lowerBound <= number && number <= upperBound) {
                    numbers++;
                }
            }
        } catch (IOException e) {
            System.out.println("Error");
        } finally {
            System.out.println("Numbers: " + numbers);
            scanner.close();
        }
    }
}
