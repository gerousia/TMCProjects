public class Counter {
    private int startValue;


    public Counter() {
        this(0);
    }

    public Counter(int startValue) {
        this.startValue = startValue;
    }

    public int value() {
        return this.startValue;
    }

    public void increase() {
        this.startValue++;
    }

    public void increase(int increasedBy) {
        if (increasedBy > 0) {
            this.startValue += increasedBy;
        }
    }

    public void decrease() {
        this.startValue--;
    }

    public void decrease(int decreasedBy) {
        if (decreasedBy > 0) {
            this.startValue -= decreasedBy;
        }
    }
}
