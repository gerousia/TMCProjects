package application;

import java.sql.SQLException;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoDao database;

    public UserInterface(Scanner scanner, TodoDao database) {
        this.scanner = scanner;
        this.database = database;
    }

    public void start() throws SQLException {
        while (true) {
            System.out.println("");
            System.out.println("Enter command:");
            System.out.println("1) list");
            System.out.println("2) add");
            System.out.println("3) mark as done");
            System.out.println("4) remove");
            System.out.println("x) quit");

            System.out.print("> ");
            String command = this.scanner.nextLine();
            if (command.equals("x")) {
                break;
            }

            // implement the functionality here
            switch (command) {
                case "1":   list();
                            break;
                case "2":   add();
                            break;
                case "3":   markAsDone();
                            break;
                case "4":   remove();
                            break;
            }
        }

        System.out.println("Thank you!");
    }

    public void list() throws SQLException {
        System.out.println("Listing the database contents");
        database.list().forEach(System.out::println);
    }

    public void add() throws SQLException {
        System.out.println("Adding new todo");
        String name = getString("Enter name");
        String description = getString("Enter description");
        database.add(new Todo(name, description, false));
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public void markAsDone() throws SQLException {
        System.out.println("Which todo should be marked as done (give the id)?");
        int id = Integer.parseInt(scanner.nextLine());
        database.markAsDone(id);
    }

    public void remove() throws SQLException {
        System.out.println("Which todo should be removed (give the id)?");
        int id = Integer.parseInt(scanner.nextLine());
        database.remove(id);
    }
}
