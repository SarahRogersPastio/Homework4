package Homework4;

public class Book {
    public String title;
    public String genre;

    public Book(String t, String g){
        this.title = t;
        this.genre = g;
    }

    public String toString(){
        System.out.println(this.title);
        return "";
    }
}
