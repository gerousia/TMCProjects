public class Item {
    private final String product;
    private final int unitPrice;
    private int qty;

    public Item(String product,
                int qty,
                int unitPrice) {
        this.product = product;
        this.unitPrice = unitPrice;
        this.qty = qty;
    }

    public int price() {
        return unitPrice * qty;
    }

    public void increaseQuantity() {
        ++this.qty;
    }

    @Override
    public String toString() {
        return this.product + ": " + this.qty;
    }
}
