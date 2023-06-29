import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private final Scanner in;

    public UserInterface(Scanner in) {
        this.in = in;
    }

    public void start() {
        while(true) {
            String input = in.nextLine();

            if (input.equals("end")) {
                break;
            }
            System.out.println(cube(Integer.parseInt(input)));
        }
    }

    public int cube(int number) {
        return (int) Math.pow(number, 3);
    }

}
