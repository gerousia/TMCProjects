
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        int hoursInDays = 24;
        int minutesInHours = 60;
        int secondsInMinutes = 60;

        System.out.println("How many days would you like to convert to seconds?");
        int days = Integer.parseInt(scanner.nextLine());
        System.out.println(days * hoursInDays * minutesInHours * secondsInMinutes);
    }
}
