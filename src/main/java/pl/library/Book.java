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
    private String yearOfPublish;

    /**
     * Book constructor without parameters
     */
    public Book() {
    }

    /**
     * Book constructor with parameters
     * @param title New book title
     * @param author New book author
     * @param yearOfPublish New year of publish
     */
    public Book(String title, String author, String yearOfPublish) {
        this.title = title;
        this.author = author;
        this.yearOfPublish = yearOfPublish;
    }

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

    public String getYearOfPublish() {
        return yearOfPublish;
    }

    public void setYearOfPublish(String yearOfPublish) {
        this.yearOfPublish = yearOfPublish;
    }

}
