/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kuchai
 */
public class Book {
    private String bookName;
    private int bookPage;
    private int bookPub;
    
    public Book (String title, int page, int year) {
        this.bookName = title;
        this.bookPage = page;
        this.bookPub = year;
    }
    
    public String toString() {
        return this.bookName + ", " + this.bookPage + " pages, " + this.bookPub;
    }
    
    public String getTitle(){
        return this.bookName;
    }
    
}
