
public class HealthStation {
    private int totalWeighings;

    public HealthStation() {
        this.totalWeighings = 0;
    }

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        ++this.totalWeighings;
        return person.getWeight();
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }

    public int weighings() {
        return this.totalWeighings;
    }

}
