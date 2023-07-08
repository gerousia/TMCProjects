
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many random numbers should be printed?");
        int n = Integer.parseInt(scanner.nextLine());

        Random number = new Random();

        for (int i = 1; i <= n; ++i) {
            System.out.println(number.nextInt(11));
        }
    }
}
