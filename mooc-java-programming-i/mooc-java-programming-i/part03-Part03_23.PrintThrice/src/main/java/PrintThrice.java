
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a word:");
        String string = scanner.nextLine();

        for (int i = 0; i < 3; i++) {
            System.out.printf(string);
        }
    }
}
