
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String[] strings = scanner.nextLine().split(" ");

            for (String string : strings) {
                if (string.contains("av")) {
                    System.out.println(string);
                }
            }
        }
    }
}
