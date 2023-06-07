import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them

        Scanner in = new Scanner(System.in);
        List<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Title: ");
            String title = in.nextLine();

            if (title.equals("")) {
                break;
            }

            System.out.println("Pages: ");
            int pages = Integer.valueOf(in.nextLine());

            System.out.println("Publication year: ");
            int year = Integer.valueOf(in.nextLine());

            books.add(new Book(title, pages, year));
        }

        System.out.println("What information will be printed?");
        String input = in.nextLine();

        for (Book book : books) {
            switch (input) {
                case "everything" : {
                    System.out.println(book);
                    break;
                } case "name" : {
                    System.out.println(book.getTitle());
                    break;
                }
            }
        }
    }
}
