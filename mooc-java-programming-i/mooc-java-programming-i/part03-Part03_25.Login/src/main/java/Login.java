
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] users = {
                {"alex", "sunshine"},
                {"emma", "haskell"}
        };

        System.out.println("Enter username:");
        String username = scanner.nextLine();

        System.out.println("Enter password:");
        String password = scanner.nextLine();

        boolean state = false;

        for (String[] user : users) {
            if (user[0].equals(username) && user[1].equals(password)) {
                state = true;
                break;
            }
        }

        if (state) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
