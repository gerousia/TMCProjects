
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }

    public static List<Book> readBooks(String file) throws IOException {
       try (Stream<String> lines = Files.lines(Paths.get(file))) {
           return lines
                   .map(line -> line.split(","))
                   .filter(line -> line.length >= 4)
                   .map(line -> new Book(
                           line[0],
                           Integer.parseInt(line[1]),
                           Integer.parseInt(line[2]),
                           line[3]))
                   .collect(Collectors.toList());
       }
    }
}
