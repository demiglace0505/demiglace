
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        //prompt for filename
        System.out.println("File: ");
        String filename = inputScanner.nextLine();
        //create object list games of type Game
        ArrayList<Game> games = readFile(filename);

        //prompt f or team name
        System.out.println("Team: ");
        String teamname = inputScanner.nextLine();
        //create object for tracking no. of games played by a team
        ArrayList<Game> gamesPlayedByTeam = new ArrayList<>();

        //---count games played by a team
        for (Game currentGame : games) {
            if (teamname.equals(currentGame.getTeam1())
                    || teamname.equals(currentGame.getTeam2())) {
                //add current game to gamesPlayedByTeam
                gamesPlayedByTeam.add(currentGame);
            }
        }
        //print no of games
        System.out.println("Games: " + gamesPlayedByTeam.size());

        
        //---wins and loses
        int wins = 0;
        int losses = 0;
        //count wins and loses of team      
        for (Game currentGame : gamesPlayedByTeam) {
            if (currentGame.wonGame(teamname)) {
                wins++;
            } else {
                losses++;
            }

        }
        //print wins and losses
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

    public static ArrayList<Game> readFile(String filename) {
        ArrayList<Game> games = new ArrayList<>();
        //read values from file
        try ( Scanner fileScanner = new Scanner(Paths.get(filename))) {
            while (fileScanner.hasNextLine()) {
                String currentLine = fileScanner.nextLine();

                //split current line
                String[] splitted = currentLine.split(",");
                String team1 = splitted[0];
                String team2 = splitted[1];
                int score1 = Integer.valueOf(splitted[2]);
                int score2 = Integer.valueOf(splitted[3]);
                //add object to games list
                games.add(new Game(team1, team2, score1, score2));
            }
        } catch (Exception err) {
            System.out.println(err);
        }

        return games;

    }

}


        /*
        Scanner inputScanner = new Scanner(System.in);
        //prompt filename
        System.out.println("File:");
        String filename = inputScanner.nextLine();
        //prompt team
        System.out.println("Team:");
        String team = inputScanner.nextLine();

        //number of games played by team
        gamesPlayed(filename, team);

    }

    public static void gamesPlayed(String filename, String team) {
        //read file
        int gameCount = 0;
        int wins = 0;
        int losses = 0;
        try ( Scanner fileScanner = new Scanner(Paths.get(filename))) {
            while (fileScanner.hasNextLine()) {
                String currentLine = fileScanner.nextLine();

                //split details
                String[] splitted = currentLine.split(",");
                String team1 = splitted[0];
                String team2 = splitted[1];
                int point1 = Integer.valueOf(splitted[2]);
                int point2 = Integer.valueOf(splitted[3]);

                //check as team 1
                if (team1.equals(team)) {
                    gameCount++;
                    if (point1 > point2) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
                
                //check as team 2
                if (team2.equals(team)) {
                    gameCount++;
                    if (point2 > point1) {
                        wins++;
                    } else {
                        losses++;
                    }
                }

            }

        } catch (Exception err) {
            System.out.println(err);
        }

        System.out.println("Games: " + gameCount);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        
         */
