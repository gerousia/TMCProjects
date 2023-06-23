public class Game {
    private final String homeTeam;
    private final String awayTeam;
    private final int homeTeamPoints;
    private final int awayTeamPoints;

    public Game(String homeTeam, String awayTeam, int homeTeamPoints, int awayTeamPoints) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeTeamPoints = homeTeamPoints;
        this.awayTeamPoints = awayTeamPoints;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public int getHomeTeamPoints() {
        return homeTeamPoints;
    }

    public int getAwayTeamPoints() {
        return awayTeamPoints;
    }

    public boolean didTeamPlay(String team) {
        return homeTeam.equals(team) || awayTeam.equals(team);
    }
}
