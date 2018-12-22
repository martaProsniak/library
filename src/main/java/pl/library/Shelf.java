package pl.library;

/**
 * Shelf for books. Number of books can be assigned to it.
 * @author Marta
 */
public class Shelf {

    /**
     * Books belonging to this shelf
     */
    private Book[] books = new Book[3];

    /**
     *
     * @param index Array where new book will be stored
     * @param book New book to be stored
     */
    public void setBook(int index, Book book){
        books[index] = book;
    }

    /**
     *
     * @param index Index of book to be returned
     * @return Book from provided index
     */
    public Book getBook (int index){
        return books[index];
    }

}

