
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a number:");
        int n = Integer.parseInt(scanner.nextLine());
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println(result);
    }
}
