
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        List<Integer> list = new ArrayList<>();

        while (true) {
            int element = Integer.parseInt(scanner.nextLine());

            if (element == 9999) {
                break;
            }
            list.add(element);
        }

        Integer smallest = null;

        for (int n : list) {
            smallest = smallest == null
                    ? n
                    : smallest < n ? smallest : n;
        }

        System.out.println("Smallest number: " + smallest);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(smallest)) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}
