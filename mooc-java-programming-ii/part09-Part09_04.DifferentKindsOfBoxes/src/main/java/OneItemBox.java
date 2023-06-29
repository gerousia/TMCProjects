import java.util.ArrayList;

public class OneItemBox extends Box {
    private final ArrayList<Item> items;

    public OneItemBox() {
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (items.isEmpty()) {
            items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return items.stream()
                .anyMatch(itemInBox -> itemInBox.equals(item));
    }
}
