
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String bookName = in.nextLine();

            if (bookName.isEmpty()) {
                break;
            }

            System.out.print("Input the age recommendation: ");
            int bookAge = Integer.parseInt(in.nextLine());

            books.add(new Book(bookName, bookAge));
            System.out.println();
        }

        System.out.println(books.size() + " books in total.");
        System.out.println();
        System.out.println("Books:");
        books.stream().sorted(Comparator
                        .comparing(Book::getAge)
                        .thenComparing(Book::getName))
                .forEach(System.out::println);
    }
}
