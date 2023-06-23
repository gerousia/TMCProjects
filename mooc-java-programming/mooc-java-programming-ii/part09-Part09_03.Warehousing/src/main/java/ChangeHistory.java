import java.util.ArrayList;
import java.util.stream.Collectors;

public class ChangeHistory {
    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        history.add(status);
    }

    public void remove(double amount) {
        history.remove(amount);
    }

    public void clear() {
        history.clear();
    }

    public double maxValue() {
        return history.stream()
                .max(Double::compare).orElse(0.0);
    }

    public double minValue() {
        return history.stream()
                .min(Double::compare).orElse(0.0);
    }

    public double average() {
        return history.stream()
                .collect(Collectors.averagingDouble(Double::doubleValue));
    }

    @Override
    public String toString() {
        return history.toString();
    }
}
