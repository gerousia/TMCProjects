import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Grades grades;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.grades = new Grades();
    }

    public void start() {
        System.out.println("Enter points totals, -1 stops:");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1) {
                System.out.println("Point average (all): " + this.grades.getAverage());
                System.out.println("Point average (passing): " + this.grades.getPassingAverage());
                System.out.println("Pass percentage: " + this.grades.getPassingPercentage());
                this.grades.printGradeDistribution();
                break;
            }
            this.grades.add(input);
        }
    }
}
