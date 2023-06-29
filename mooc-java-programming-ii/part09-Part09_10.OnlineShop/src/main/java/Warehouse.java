import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private final Map<String, Integer> productsPrice;
    private final Map<String, Integer> productsStock;

    public Warehouse() {
        this.productsPrice = new HashMap<>();
        this.productsStock = new HashMap<>();
    }

    public void addProduct(String product,
                           int price,
                           int stock) {
        this.productsPrice.put(product, price);
        this.productsStock.put(product, stock);
    }

    public int price(String product) {
        if (productsPrice.containsKey(product))  {
            return productsPrice.get(product);
        }
        return -99;
    }

    public int stock(String product) {
        if (productsStock.containsKey(product))  {
            return productsStock.get(product);
        }
        return 0;
    }

    public boolean take(String product) {
        if (productsStock.containsKey(product) && productsStock.get(product) > 0) {
            productsStock.replace(product, productsStock.get(product) - 1);
            return true;
        }
        return false;
    }

    public Set<String> products() {
        return productsPrice.keySet();
    }
}
