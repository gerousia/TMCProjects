
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here

        List<Double> numbers = new ArrayList<>();

        while (true) {
            String command = scanner.nextLine();

            if (command.equals("end")) {
                break;
            }

            double number = Double.parseDouble(command);

            numbers.add(number);
        }
        System.out.printf("Average of the numbers: " + numbers.stream().mapToDouble(Double::valueOf).average().getAsDouble());

    }
}
