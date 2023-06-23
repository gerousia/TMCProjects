
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String[] strings = scanner.nextLine().split(" ");
            System.out.println(strings[strings.length - 1]);
        }
    }
}
