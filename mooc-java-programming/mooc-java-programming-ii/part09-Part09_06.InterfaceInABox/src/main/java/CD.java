public class CD implements Packable{
    private final String artist;
    private final String name;
    private final int publicationYear;
    private final double weight;

    public CD(String artist, String name, int publicationYear) {
        this.artist = artist;
        this.name = name;
        this.publicationYear = publicationYear;
        this.weight = 0.1;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("%s: %s (%d)", this.artist, this.name, this.publicationYear);
    }
}
