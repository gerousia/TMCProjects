import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int currentWeight = 0;

        for (Suitcase listSuitcase : this.suitcases) {
            currentWeight += listSuitcase.totalWeight();
        }

        if (currentWeight + suitcase.totalWeight() <= maxWeight) {
            this.suitcases.add(suitcase);
        }
    }

    public void printItems() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }

    @Override
    public String toString() {
        if (this.suitcases.isEmpty()) {
            return "no suitcases (0 kg)";
        }

        if (this.suitcases.size() == 1) {
            return this.suitcases.size() + " suitcase (" + this.suitcases.get(0).totalWeight() + " kg)";
        }

        int holdWeight = 0;

        for (Suitcase suitcase : this.suitcases) {
            holdWeight += suitcase.totalWeight();
        }
        return this.suitcases.size() + " suitcases (" + holdWeight + " kg)";
    }
}
