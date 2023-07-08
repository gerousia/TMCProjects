import java.util.Arrays;

public class MagicSquareFactory {

    public static int isWithinBound(int arraySize, int bound) {
        if (bound == -1) {
            bound = arraySize - 1;
        } else if (bound == arraySize) {
            bound = 0;
        }
        return bound;
    }

    public MagicSquare createMagicSquare(int size) {
        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        int number = 1;
        int x = 0;
        int y = size / 2;

        while (number <= size * size) {
            if (square.readValue(x, y) != 0) {
                x = isWithinBound(size, ++x);
                x = isWithinBound(size, ++x);
                y = isWithinBound(size, --y);
            }
            square.placeValue(x, y, number++);
            x = isWithinBound(size, --x);
            y = isWithinBound(size, ++y);
        }
        return square;
    }
}
