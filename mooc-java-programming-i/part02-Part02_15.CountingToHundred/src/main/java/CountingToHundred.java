
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        if (n < 100) {
            for (int i = n; i <= 100; i++) {
                System.out.println(i);
            }
        }
    }
}
