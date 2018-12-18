package pl.library;

/**
 * Book representation.
 * @author Marta
 */

public class Book {

    /**
     * Book title.
     */
    private String title;
    /**
     * Book author.
     */
    private String author;
    /**
     * Year of publish.
     */
    private int yearOfPublish;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublish() {
        return yearOfPublish;
    }

    public void setYearOfPublish(int yearOfPublish) {
        this.yearOfPublish = yearOfPublish;
    }
}