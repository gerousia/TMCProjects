import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private final Scanner in;

    public UserInterface(Scanner in) {
        this.in = in;
    }

    public void start() {
        List<Integer> numbers = new ArrayList<>();

        while (true) {
            int number = Integer.valueOf(in.nextLine());

            if (number == 0) {
                double average = getAverage(numbers);
                System.out.println((average != 0
                        ? average
                        : "Cannot calculate the average"));
                return;
            } else if (number > 0) {
                numbers.add(number);
            }
        }
    }

    public double getAverage(List<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }

        double result = 0;

        for (Integer number : list) {
            result += number;
        }
        return result / list.size();
    }
}