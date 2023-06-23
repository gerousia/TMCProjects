public class Container {
    private int amount;
    private static final int CAPACITY = 100;

    public Container() {
        this.amount = 0;
    }

    public int contains() {
        return this.amount;
    }

    public void add(int amount) {
        if (amount < 0) return;

        this.amount += amount;

        if (this.amount > CAPACITY) this.amount = CAPACITY;
    }

    public void remove(int amount) {
        if (amount < 0) return;

        this.amount = amount >= CAPACITY
                ? 0
                : this.amount - amount;

        if (this.amount < 0) this.amount = 0;
    }

    public void move(Container toContainer, int amount) {
        if (amount < 0) return;

        int amountToMove = Math.min(this.amount, amount);

        toContainer.add(amountToMove);
        this.remove(amountToMove);
    }

    @Override
    public String toString() {
        return String.valueOf(this.amount) + "/100";
    }
}
