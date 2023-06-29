
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here

        List<Integer> numbers = new ArrayList<>();

        while (true) {
            String command = scanner.nextLine();

            if (command.equals("end")) {
                break;
            }

            int number = Integer.parseInt(command);

            numbers.add(number);

        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String input = scanner.nextLine();

        double average = 0;
        String sign = "";

        if (input.equalsIgnoreCase("p")) {
            sign = "positive";
            average = numbers.stream()
                    .filter(number -> number >= 0)
                    .mapToDouble(Double::valueOf)
                    .average()
                    .orElse(0.0);
        } else if (input.equalsIgnoreCase("n")) {
            sign = "negative";
            average = numbers.stream()
                    .filter(number -> number < 0)
                    .mapToDouble(Double::valueOf)
                    .average()
                    .orElse(0.0);
        }

        System.out.printf("Average of the " + sign + " numbers: " + average);

    }
}