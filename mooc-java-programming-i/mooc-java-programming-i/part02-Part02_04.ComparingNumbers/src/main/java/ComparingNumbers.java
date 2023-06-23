
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        if (first == second) {
            System.out.printf("%d is equal to %d.", first, second);
        } else if (first > second) {
            System.out.printf("%d is greater than %d.", first, second);
        } else {
            System.out.printf("%d is smaller than %d.", first, second);
        }
    }
}
