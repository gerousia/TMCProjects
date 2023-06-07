
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();

        try (Scanner line = new Scanner(Paths.get(file))) {
            List<Game> games = new ArrayList<>();

            while (line.hasNextLine()) {
                String[] lineSplit = line.nextLine().split(",");
                games.add(new Game(
                        lineSplit[0],
                        lineSplit[1],
                        Integer.valueOf(lineSplit[2]),
                        Integer.valueOf(lineSplit[3])));
            }

            System.out.println("Team:");
            String team = scan.nextLine();

            int numberOfGames = 0;
            int numberOfWins = 0;
            int numberOfLosses = 0;

            for (Game game : games) {

                if (game.didTeamPlay(team)) {
                    numberOfGames++;

                    if (game.getHomeTeam().equals(team) && game.getHomeTeamPoints() > game.getAwayTeamPoints()) {
                        numberOfWins++;
                    } else if (game.getAwayTeam().equals(team) && game.getHomeTeamPoints() < game.getAwayTeamPoints()) {
                        numberOfWins++;
                    } else {
                        numberOfLosses++;
                    }
                }
            }

            System.out.println("Games: " + numberOfGames);
            System.out.println("Wins: " + numberOfWins);
            System.out.println("Losses: " + numberOfLosses);

        } catch (IOException e) {
            System.out.println("Error: " + file + " not found.");
        } finally {
            scan.close();
        }
    }
}
