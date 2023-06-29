public enum Education {
    PHD("Doctoral degree"),
    MA("Masters degree"),
    BA("Bachelors degree"),
    HS("High school diploma");

    private final String degree;

    Education(String degree) {
        this.degree = degree;
    }

    public String getDegree() {
        return this.degree;
    }
}
