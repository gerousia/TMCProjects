import java.util.Scanner;

public class UserInterface {
    private final Scanner in;
    private TodoList list;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.in = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = in.nextLine();

            switch (command) {
                case "stop":
                    return;
                case "add" :
                    System.out.print("To add:");
                    String task = in.nextLine();
                    this.list.add(task);
                    break;
                case "list" :
                    this.list.print();
                    break;
                case "remove" :
                    System.out.print("Which one is removed? ");
                    int index = Integer.parseInt(in.nextLine());
                    this.list.remove(index);
            }
        }
    }
}
