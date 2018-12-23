package pl.library;

/**
 * Bookstand for shelves. Number of shelves can be assigned to it
 * @author Marta
 */
public class Bookstand {
    /**
     * Shelves belonging to this bookstand
     */
    private Shelf [] shelves = new Shelf[2];

    /**
     * @param index Array where shelves will be stored
     * @param shelf New shelf to store the books
     */
   public void setShelf(int index, Shelf shelf){
       shelves[index] = shelf;
   }

    /**
     * @param index Index of shelf to be returned
     * @return shelf from provided index
     */
    public Shelf getShelf (int index) {
        return shelves[index];
    }
}
