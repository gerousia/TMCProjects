
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int grade = Integer.parseInt(scan.nextLine());

        if (grade < 0) {
            System.out.println("impossible!");
        }

        if (0 <= grade && grade <= 49) {
            System.out.println("failed");
        }

        if (50 <= grade && grade <= 59) {
            System.out.println(1);
        }

        if (60 <= grade && grade <= 69) {
            System.out.println(2);
        }

        if (70 <= grade && grade <= 79) {
            System.out.println(3);
        }

        if (80 <= grade && grade <= 89) {
            System.out.println(4);
        }

        if (90 <= grade && grade <= 100) {
            System.out.println(5);
        }

        if (100 < grade) {
            System.out.println("incredible!");
        }
    }
}
