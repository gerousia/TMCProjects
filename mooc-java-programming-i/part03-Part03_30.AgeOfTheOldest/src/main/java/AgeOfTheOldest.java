
import java.util.Arrays;
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] users = new String[0][0];

        while (scanner.hasNext()) {
            users = Arrays.copyOf(users, users.length + 1);
            users[users.length - 1] = scanner.next().split(",");;
        }

        int age = 0;

        for (String[] user : users) {
            age = age > Integer.valueOf(user[1]) ? age : Integer.valueOf(user[1]);
        }

        System.out.println(age);
    }
}
