
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.

        List<Integer> numbers = new ArrayList<>();

        while (true) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number == -1) {
                break;
            }

            numbers.add(number);
        }

        int sum = 0;

        for (int n : numbers) {
            sum += n;
        }

        System.out.println((double) sum / numbers.size());
    }
}
