import java.util.ArrayList;

public class Box implements Packable {
    private final double capacity;
    private double weight;
    private final ArrayList<Packable> items;

    public Box(double capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    public void add(Packable item) {
        if (weight() + item.weight() <= capacity) {
            items.add(item);
        }
    }

    @Override
    public double weight() {
        return items.stream()
                .map(Packable::weight)
                .reduce(0.0, Double::sum);
    }

    @Override
    public String toString() {
        return String.format("Box: %d items, total weight %.1f kg",
                items.size(),
                weight());
    }
}
