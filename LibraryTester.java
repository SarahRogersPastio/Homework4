package Homework4;

public class LibraryTester {
    
    public static void main(String[] args) {
        
        BookShelf OShelf = new BookShelf();
        OShelf.setLetter('O');

        BookShelf TShelf = new BookShelf();
        TShelf.setLetter('T');

        OShelf.toString();
        TShelf.toString();

        Book theHeart   = new Book("The Heart of the Betrayed","Crime");
        Book ourHill    = new Book("Our Hill of Stars","Fantasy");
        Book oneOfAKind = new Book("One of a Kind","Science Fiction");
        Book theVision  = new Book("The Vision of Roses","Romance");

        theHeart.toString();
        ourHill.toString();
        oneOfAKind.toString();
        theVision.toString();

        OShelf.addBook(theHeart);
        OShelf.addBook(ourHill);
        OShelf.addBook(oneOfAKind);
        OShelf.addBook(theVision);

        TShelf.addBook(theHeart);
        TShelf.addBook(ourHill);
        TShelf.addBook(oneOfAKind);
        TShelf.addBook(theVision);

        OShelf.toString();
        TShelf.toString();
    }
}
