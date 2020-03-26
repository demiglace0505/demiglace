
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
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
        
    }
    

}
