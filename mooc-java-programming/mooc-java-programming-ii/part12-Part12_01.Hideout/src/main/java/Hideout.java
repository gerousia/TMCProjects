import java.util.ArrayList;
import java.util.List;

public class Hideout<T> {
    private final List<T> items;

    public Hideout() {
        this.items = new ArrayList<>();
    }

    public void putIntoHideout(T toHide) {
        if (isInHideout()) items.clear();
        items.add(toHide);
    }

    public T takeFromHideout() {
        T item = items
                .stream()
                .findFirst()
                .orElse(null);

        items.remove(item);
        return item;
    }

    public boolean isInHideout() {
        return items.size() > 0;
    }

    public void print() {
        items.forEach(System.out::println);
    }
}
