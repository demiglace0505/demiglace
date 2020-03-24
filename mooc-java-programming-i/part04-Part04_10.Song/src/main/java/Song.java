/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kuchai
 */
public class Song {
    private String songName;
    private int songLength;
    
    public Song(String name, int length){
        this.songName = name;
        this.songLength = length;
    }
    
    public String name(){
        return this.songName;
    }
    
    public int length(){
        return this.songLength;
    }
    
}
