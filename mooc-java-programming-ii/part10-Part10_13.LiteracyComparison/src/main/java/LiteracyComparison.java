
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        String file = "literacy.csv";
        try (Stream<String> lines = Files.lines(Paths.get(file))) {
            lines
                    .map(line -> line.split(","))
                    .map(line -> new Literacy(
                            line[0],
                            line[1].trim(),
                            line[2].replace("(%)", "").trim(),
                            line[3].trim(),
                            Integer.parseInt(line[4].trim()),
                            Double.parseDouble(line[5].trim())
                    ))
                    .sorted()
                    .forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("ERROR");
        }
    }
}
