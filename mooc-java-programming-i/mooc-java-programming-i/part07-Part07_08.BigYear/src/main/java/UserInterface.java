import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Avians avians;


    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.avians = new Avians();
    }

    public void start() {
        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine();

            switch (command) {
                case "Quit":
                    return;
                case "Add": {
                    System.out.print("Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Name in Latin: ");
                    String latinName = scanner.nextLine();

                    this.avians.addBird(name, latinName);
                    break;
                }
                case "Observation": {
                    System.out.print("Bird? ");
                    String name = scanner.nextLine();

                    if (this.avians.containsBird(name)) {
                        this.avians.observeBird(name);
                    } else {
                        System.out.println("Not a bird!");
                    }
                    break;
                }
                case "All":
                    this.avians.printAllBirds();
                    break;
                case "One": {
                    System.out.print("Bird? ");
                    String name = scanner.nextLine();

                    if (this.avians.containsBird(name)) {
                        this.avians.printBird(name);
                    } else {
                        System.out.println("Not a bird!");
                    }
                    break;
                }
            }
        }
    }
}
