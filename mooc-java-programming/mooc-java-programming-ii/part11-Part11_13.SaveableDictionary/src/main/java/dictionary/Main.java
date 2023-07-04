package dictionary;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        // You can test your dictionary here
        SaveableDictionary dictionary = new SaveableDictionary("words.txt");
        dictionary.load();

        // use the dictionary
        dictionary.save();
    }
}
