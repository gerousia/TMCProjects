import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> hashmap;

    public IOU() {
        this.hashmap = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        if (!hashmap.containsKey(toWhom)) {
            hashmap.put(toWhom, amount);
        }
    }

    public double howMuchDoIOweTo(String toWhom) {
       return hashmap.getOrDefault(toWhom, 0.0);
    }
}
