
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        int start = Integer.parseInt(scanner.nextLine());

        System.out.println("Where from?");
        int end = Integer.parseInt(scanner.nextLine());

        if (start >= end) {
            for (int i = end; i <= start; i++) {
                System.out.println(i);
            }
        }
    }
}
