
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");

            System.out.print("> ");
            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]) < 0
                    ? 0
                    : Integer.valueOf(parts[1]);

            switch (command) {
                case "add":
                    firstContainer += amount;
                    if (firstContainer > 100) firstContainer = 100;
                    break;
                case "move":

                    secondContainer +=  firstContainer - amount < 0
                            ? firstContainer
                            : amount;

                    if (secondContainer > 100) secondContainer = 100;

                    firstContainer = amount > 100
                            ? 0
                            : firstContainer - amount;
                    break;
                case "remove":
                    secondContainer = secondContainer - amount < 0
                            ? 0
                            : secondContainer - amount;
                    break;
            }
        }
    }
}
