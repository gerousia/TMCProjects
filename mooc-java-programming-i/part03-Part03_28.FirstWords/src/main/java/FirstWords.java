
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String[] strings = scanner.nextLine().split(" ");
            System.out.println(strings[0]);
        }
    }
}
