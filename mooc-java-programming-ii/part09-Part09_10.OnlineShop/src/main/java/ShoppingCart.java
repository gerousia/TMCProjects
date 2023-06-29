import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private final Map<String, Item> items;

    public ShoppingCart() {
        this.items = new HashMap<>();
    }

    public void add(String product,
                    int price) {
        Item item = items.getOrDefault(product, new Item(product, 0, price));
        item.increaseQuantity();
        items.put(product, item);
    }

    public int price() {
        return items.values().stream()
                .mapToInt(Item::price)
                .reduce(0, Integer::sum);
    }

    public void print() {
        items.values().forEach(System.out::println);
    }
}
