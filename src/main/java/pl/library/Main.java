package pl.library;

import java.util.Scanner;

/**
 * main class for this application
 * @author Marta
 */

public class Main {

    /**
     *application starting method.
     * @param args Command line application starting arguments.
     */

    public static  void main (String [] args) {

        System.out.println("Hello world!");

        //Add Scanner for reading input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter book author");
        String author = scanner.next();
        System.out.println("Enter book title");
        String title = scanner.next();
        System.out.println("Enter year of publish (YYYY)");
        int year = scanner.nextInt();

        Book book1 = new Book(author, title, year);

        System.out.println(book1.getAuthor());
        System.out.println(book1.getTitle());
        System.out.println(book1.getYearOfPublish());

    }

}
