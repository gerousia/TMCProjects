import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private final int capacity;
    private int balance;
    private final ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.balance = 0;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        int itemWeight = item.getWeight();
        if (itemWeight + balance <= capacity) {
            balance += itemWeight;
            items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return items.stream()
                .anyMatch(itemInBox -> itemInBox.equals(item));
    }
}
