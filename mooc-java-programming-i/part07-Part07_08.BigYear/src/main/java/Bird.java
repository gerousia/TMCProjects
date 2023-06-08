public class Bird {
    private String name;
    private String latinName;
    private int observations;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;
    }

    public void observe() {
        ++this.observations;
    }

    public String getName() {
        return name;
    }

    public int getObservations() {
        return observations;
    }

    @Override
    public String toString() {
        return this.name + "(" + this.latinName + "): " + observations + " observations";
    }
}
