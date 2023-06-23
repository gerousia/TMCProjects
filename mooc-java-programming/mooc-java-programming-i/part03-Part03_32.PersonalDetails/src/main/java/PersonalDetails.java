
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] users = new String[0][0];

        while (scanner.hasNext()) {
            users = Arrays.copyOf(users, users.length + 1);
            users[users.length - 1] = scanner.next().split(",");
        }

        String[] longest = new String[2];
        int sumOfYears = 0;

        for (String[] user : users) {
            longest = longest[0] == null
                    ? user
                    : Integer.valueOf(longest[0].length()) >= Integer.valueOf(user[0].length()) ? longest : user;

            sumOfYears += Integer.valueOf(user[1]);
        }

        System.out.println("Longest name: " + longest[0]);
        System.out.println("Average of the birth years: " + ((double) sumOfYears / users.length));
    }
}
