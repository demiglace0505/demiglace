/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kuchai
 */
public class Game {
    private String team1;
    private String team2;
    private int score1;
    private int score2;
    
    public Game(String team1, String team2, int score1, int score2) {
        this.team1 = team1;
        this.team2 = team2;
        this.score1 = score1;
        this.score2 = score2;
    }
    
    public String getTeam1(){
        return this.team1;
    }
    
    public String getTeam2(){
        return this.team2;
    }
    
    public int getScore1(){
        return this.score1;
    }
    
    public int getScore2(){
        return this.score2;
    }
    
    public boolean wonGame(String teamname){
        if ( teamname.equals(team1) && ( score1 > score2 ) ) {
            return true;
        }
        if (teamname.equals(team2) && ( score1 < score2) ){
            return true;
        }
               
        return false;
    }
    
    
    public String toString(){
        return team1 + team2 + score1 + score2;
    }
    
}   
