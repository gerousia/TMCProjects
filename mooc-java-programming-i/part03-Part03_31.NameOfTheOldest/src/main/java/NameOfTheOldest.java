
import java.util.Arrays;
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] users = new String[0][0];

        while (scanner.hasNext()) {
            users = Arrays.copyOf(users, users.length + 1);
            users[users.length - 1] = scanner.next().split(",");
        }

        String[] oldest = new String[2];

        for (String[] user : users) {
            oldest = oldest[1] == null
                    ? user
                    : Integer.valueOf(oldest[1]) >= Integer.valueOf(user[1]) ? oldest : user;
        }

        System.out.println("Name of the oldest: " + oldest[0]);
    }
}
