package pl.library;

import java.util.Scanner;

/**
 * main class for this application
 * @author Marta
 */

public class Main {

    /**
     * Array for all shelves
     */
    private static Bookstand[] bookstands = new Bookstand[2];

    /**
     *application starting method.
     * @param args Command line application starting arguments.
     */
    public static  void main (String [] args) {

        System.out.println("Book catalog");

        //Add Scanner for reading input
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while (running) {

            int command = scanner.nextInt();//Read next user command

            switch (command) {
                case 1: { //Add new book
                    addNewBook(scanner);
                    break;
                }

                case 2: { //Print info about chosen book
                    printBook(scanner);
                    break;
                }

               case 3: { //Print the whole library
                    printLibrary();
                    break;
               }

               case 0: { //Quit
                    running = false;
                    break;
               }

               default: {
                    printMenu();
               }
            }
        }
    }

    /**
     * Prints all books on the shelf
     */
    /*When the whole table won't be filled the exception will occur
      NullPointerException*/
    private static void printLibrary() {
        //bookstands iterator
        for (int k = 0; k < 2; k++) {
            //shelves iterator
            for (int j = 0; j < 2; j++) {
                //books iterator
                for (int i = 0; i < 2; i++) {
                    System.out.println(bookstands[k].getShelf(j).getBook(i).getAuthor() +
                            " " + bookstands[k].getShelf(j).getBook(i).getTitle() +
                            " " + bookstands[k].getShelf(j).getBook(i).getYearOfPublish());
                }
            }
        }
    }

    /**
     * Prints user menu
     */
    private static void printMenu() {
        System.out.println("Valid commands are:\n" +
                "1 - add\n" +
                "2 - print book\n" +
                "3 - print the whole library\n" +
                "0 - quit\n");
    }
    /**
     * Reads user input ant prints info about chosen book
     * @param scanner scanner
     */
    private static void printBook(Scanner scanner) {
        System.out.println("Enter bookstand index");
        int standIndex = scanner.nextInt(); //Read bookstand index to be printed
        System.out.println("Enter shelf index");
        int shelfIndex = scanner.nextInt(); //Read shelf index to be printed
        System.out.println("Enter book index");
        int index = scanner.nextInt(); //Read book index to be printed
        //get method to allow print private fields
        System.out.println("Author: "
                + bookstands[standIndex].getShelf(shelfIndex).getBook(index).getAuthor());
        System.out.println("Title: "
                + bookstands[standIndex].getShelf(shelfIndex).getBook(index).getTitle());
        System.out.println("Year of publish: "
                + bookstands[standIndex].getShelf(shelfIndex).getBook(index).getYearOfPublish());
    }
    /**
     * Reads user input and adds new book
     * @param scanner scanner
     */
    private static void addNewBook(Scanner scanner) {
        //Create local variables for author, title and year
        System.out.println("Enter bookstand index");
        int standIndex = scanner.nextInt();
        System.out.println("Enter shelf index");
        int shelfIndex = scanner.nextInt();
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

        //Check if bookstand already exists
        if(bookstands[standIndex] == null){
            //Creates new bookstand if doesn't exist
            Bookstand bookstand = new Bookstand();
            //Assign local variables to global ones
            bookstands[standIndex] = bookstand;
        }
        //Check if shelf already exists
        if (bookstands[standIndex].getShelf(shelfIndex) == null) {
            //Add new shelf if doesn't exist
            Shelf shelf = new Shelf();
            //Set new shelf and new book
            bookstands[standIndex].setShelf(shelfIndex, shelf);
            shelf.setBook(index, book);
        } else {
            //Get shelf if already exists and set new book
            bookstands[standIndex].getShelf(shelfIndex).setBook(index, book);
        }

        }

    }


