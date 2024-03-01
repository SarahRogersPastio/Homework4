package Homework4;
import java.util.ArrayList;

public class BookShelf {
    public char firstLetter;
    public ArrayList<Book> books;

    public BookShelf(){
        this.books = new ArrayList<Book>();
    }

    public char getLetter(){
        return this.firstLetter;
    }

    public void setLetter(char l){
        this.firstLetter = l;
    }

    public ArrayList<Book> getBooks(){
        return this.books;
    }

    public void setBooks(ArrayList<Book> a){
        this.books = a;
    }
    
    public void addBook(Book b){
        if (books.size() <= 8){ // This is where I set the maximum to eight books.
            if (b.title.charAt(0) == firstLetter){
                books.add(b);
            }
            else{
                return;
            }
        }
        else{
            System.out.println("There are eight books on this shelf. This shelf is full.");
        }
    }

    public void removeBook(Book b){
        for (int i = 0; i < books.size(); i++){
            if (books.get(i) == b){
                books.remove(i);
            }
        }
    }

    public String toString(){
        if (books.isEmpty()){
            System.out.println(""); 
            // Bookshelf instructions would have ("Empty") instead. 
            // This ("") follows the expexted output from the end of the instructions.
        }
        else{
            for (int i = 0; i < books.size(); i++){
                System.out.print(books.get(i).title + "   ");
            }
            System.out.println("");
        }
        return "";
    }
}
