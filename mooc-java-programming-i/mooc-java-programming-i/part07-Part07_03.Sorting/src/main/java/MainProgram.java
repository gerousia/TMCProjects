import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        // indices:       0  1  2  3   4
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++ ) {
            if (array[i] > array[indexOfSmallestFrom(array, i)]) {
                swap(array, i, indexOfSmallestFrom(array, i));
                System.out.println(Arrays.toString(array));
            }
        }
    }

    public static int smallest(int[] array) {
        int smallest = array[array.length - 1];

        for (int number : array) {
            smallest = smallest < number ? smallest : number;
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = smallest(array);

        for (int i = 0; i < array.length; i++) {
            if ( smallest == array[i]) {
                return i;
            }
        }
        return 0;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int smallest = smallest(Arrays.copyOfRange(array, startIndex, array.length));

        for (int i = startIndex; i < array.length; i++) {
            if (smallest == array[i]) {
                return i;
            }
        }
        return 0;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
