package pl.library;

/**
 * Library for all books
 * @author Marta
 */
public class Library {
    /**
     * Bookstands belonging to this library
     */
    private Bookstand[] bookstands = new Bookstand[2];

    /**
     *
     * @param standIndex Array where bookstands will be store
     * @param bookstand New bookstand to store the books
     */
    public void setBookstand(int standIndex, Bookstand bookstand) {
        bookstands[standIndex] = bookstand;
    }

    /**
     * 0
     * @param standIndex Index of bookstand to be returned
     * @return Bookstand from provided index
     */
    public Bookstand getBookstand(int standIndex) {
        return bookstands[standIndex];
    }


}
