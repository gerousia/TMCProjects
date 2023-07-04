package dictionary;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.*;

public class SaveableDictionary {
    private final String file;
    private final Map<String, String> dictionary;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
        this.file = null;
    }

    public SaveableDictionary(String file) {
        this.dictionary = new HashMap<>();
        this.file = file;
    }

    public boolean load() {
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNext()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                dictionary.put(parts[0], parts[1]);
            }
            return true;
        } catch (IOException ignore) {
            return false;
        }
    }

    public boolean save() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
            dictionary.forEach((word, translation) -> writer.printf("%s:%s%n", word, translation));
            return true;
        } catch (IOException ignore) {
            return false;
        }
    }

    public void add(String words, String translation) {
        dictionary.putIfAbsent(words, translation);
    }

    public String translate(String word) {
        return dictionary.entrySet().stream()
                .filter(entry -> entry.getKey().equals(word) || entry.getValue().equals(word))
                .map(entry -> entry.getKey().equals(word) ? entry.getValue() : entry.getKey())
                .findFirst()
                .orElse(null);
    }

    public void delete(String word) {
        Iterator<Map.Entry<String, String>> iterator = dictionary.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if (entry.getKey().equals(word)) {
                iterator.remove();
            } else if (entry.getValue().equals(word)) {
                iterator.remove();
            }
        }
    }
}
