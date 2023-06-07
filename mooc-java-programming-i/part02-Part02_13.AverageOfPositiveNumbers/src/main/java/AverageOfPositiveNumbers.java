
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int input = Integer.parseInt(scanner.nextLine());

            if (input == 0) {
                break;
            }

            if (input > 0) {
                n++;
                sum += input;
            }
        }

        if (n == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println("Average of the numbers: " + ((double) sum / n));
        }
    }
}
