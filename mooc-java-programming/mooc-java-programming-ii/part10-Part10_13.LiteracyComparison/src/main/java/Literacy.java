public class Literacy implements Comparable<Literacy> {
    private final String theme;
    private final String ageGroup;
    private final String gender;
    private final String country;
    private final int year;
    private final double literacyPct;

    public Literacy(String theme,
                    String ageGroup,
                    String gender,
                    String country,
                    int year,
                    double literacyPct) {
        this.theme = theme;
        this.ageGroup = ageGroup;
        this.gender = gender;
        this.country = country;
        this.year = year;
        this.literacyPct = literacyPct;
    }

    public double getLiteracyPct() {
        return this.literacyPct;
    }

    @Override
    public String toString() {
        return String.format("%s (%d), %s, ", country, year, gender) + this.getLiteracyPct();
    }

    @Override
    public int compareTo(Literacy another) {
        return Double.compare(this.getLiteracyPct(), another.getLiteracyPct());
    }
}
