
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("First number?");
        int start = Integer.parseInt(scanner.nextLine());

        System.out.println("Last number?");
        int end = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        if (start <= end) {
            for (int i = start; i <= end; i++) {
                sum += i;
            }
        }
        System.out.println("The sum is: " + sum);
    }
}
