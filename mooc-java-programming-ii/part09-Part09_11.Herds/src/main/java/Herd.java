import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Herd implements Movable{
    private final List<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        herd.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        herd.forEach(movable -> movable.move(dx, dy));
    }

    @Override
    public String toString() {
        return herd.stream()
                .map(Object::toString)
                .collect(Collectors.joining("\n"));
    }
}
