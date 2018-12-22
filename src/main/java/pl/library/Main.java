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

        System.out.println("Book catalog");

        //Add Scanner for reading input
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        Book[] books = new Book[3]; //New array to store books

        while (running) {

            int command = scanner.nextInt();//Read next user command

            switch (command) {
                case 1: { //Add new book
                    //Create local variables for author, title and year
                    System.out.println("Enter book index");
                    int index = scanner.nextInt();
                    System.out.println("Enter book author");
                    String author = scanner.next();
                    System.out.println("Enter book title");
                    String title = scanner.next();
                    System.out.println("Enter year of publish");
                    String year = scanner.next();
                    //Create new book:
                    Book book = new Book(author, title, year);
                    //Assign local variables to global
                    books[index] = book;

                    break;
                }

                case 2: { //Print info about chosen book

                    System.out.println("Enter book index");
                    int index = scanner.nextInt(); //Read book index to be printed
                    System.out.println("Author: " + books[index].getAuthor());
                    System.out.println("Title: " + books[index].getTitle());
                    System.out.println("Year of publish: " + books[index].getYearOfPublish());

                    break;
                }

                case 3: { //Print the whole library
                        for (Book b : books) { //for all books in books array
                            System.out.println(b.getAuthor() +
                                    " " + b.getTitle() +
                                    " " + b.getYearOfPublish());
                        }
                        break;
                    }

                case 0: { //Quit
                    running = false;
                    break;
                }

                default: {
                    System.out.println("Valid commands are:\n" +
                        "1 - add\n" +
                        "2 - print book\n" +
                        "3 - print the whole library\n" +
                        "0 - quit\n");
                }
            }
        }

    }

}
