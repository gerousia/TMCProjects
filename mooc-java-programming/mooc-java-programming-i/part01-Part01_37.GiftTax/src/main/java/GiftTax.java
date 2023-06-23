
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        double tax = Double.parseDouble(scan.nextLine());

        if (5_000 > tax) {
            System.out.println("No tax!");
        }

        if (5_000 <= tax && tax <= 25_000) {
            tax = (100 + (tax - 5_000) * 0.08);
            System.out.println("Tax: " + tax);
        }

        if (25_000 <= tax && tax <= 55_000) {
            tax = (1_700 + (tax - 25_000) * 0.1);
            System.out.println("Tax: " + tax);
        }

        if (55_000 <= tax && tax <= 200_000) {
            tax = (4_700 + (tax - 55_000) * 0.12);
            System.out.println("Tax: " + tax);
        }

        if (200_000 <= tax && tax <= 1_000_000) {
            tax = (22_100 + (tax - 200_000) * 0.15);
            System.out.println("Tax: " + tax);
        }

        if (tax > 1_000_000) {
            tax = (142_100 + (tax - 1_000_000) * 0.17);
            System.out.println("Tax: " + tax);
        }
    }
}
