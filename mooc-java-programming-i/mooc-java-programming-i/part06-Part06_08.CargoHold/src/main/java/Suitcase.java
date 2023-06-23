import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        int currentWeight = 0;

        for (Item listItem : this.items) {
            currentWeight += listItem.getWeight();
        }

        if (currentWeight + item.getWeight() <= maxWeight) {
            this.items.add(item);
        }
    }

    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }

        Item heaviestItem = this.items.get(0);

        for (Item item : this.items) {
            heaviestItem = heaviestItem.getWeight() > item.getWeight()
                    ? heaviestItem
                    : item;
        }
        return heaviestItem;
    }

    public int totalWeight() {
        int totalWeight = 0;

        for (Item item : this.items) {
            //allItems.append(item.toString()).append("\n");
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item.getName() + " (" + item.getWeight() + " kg)");
        }
    }

    @Override
    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        }

        if (this.items.size() == 1) {
            return this.items.size() + " item (" + this.items.get(0).getWeight() + " kg)";
        }

        //StringBuilder allItems = new StringBuilder();

        int suitcaseWeight = 0;

        for (Item item : this.items) {
            //allItems.append(item.toString()).append("\n");
            suitcaseWeight += item.getWeight();
        }
        return this.items.size() + " items (" + suitcaseWeight + " kg)";
    }
}
