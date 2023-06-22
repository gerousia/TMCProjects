import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> abbreviation;

    public Abbreviations() {
        this.abbreviation = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation,
                                String explanation) {
        this.abbreviation.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        return this.abbreviation.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
        return this.abbreviation.getOrDefault(abbreviation, null);
    }
}
