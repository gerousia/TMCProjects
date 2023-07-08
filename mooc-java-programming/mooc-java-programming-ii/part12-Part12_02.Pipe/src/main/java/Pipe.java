import java.util.ArrayList;
import java.util.List;

public class Pipe<T> {
    private List<T> values;

    public Pipe() {
        this.values = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        values.add(value);
    }

    public T takeFromPipe() {
        T value = values.get(0);
        values.remove(0);
        return value;
    }

    public boolean isInPipe() {
        return !values.isEmpty();
    }
}
