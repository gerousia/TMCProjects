
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String[] strings = scanner.nextLine().split(" ");

            for (String string : strings) {
                System.out.println(string);
            }
        }
    }
}
