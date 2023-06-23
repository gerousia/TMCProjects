
public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        // initialize the variable numberCount here
        this.count = 0;
    }

    public void addNumber(int number) {
        // write code here
        this.count++;
        this.sum += number;
    }

    public int getCount() {
        // write code here
        return count;
    }

    public int sum() {
        // write code here
        return sum;
    }

    public double average() {
        // write code here
        return count != 0 ? (double) sum / count : 0;
    }
}