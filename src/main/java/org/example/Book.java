package org.example;

import java.util.ArrayList;

public class Book {
    // Declare private variables to store title, author and ISBN
    private String title, author, ISBN;
    private static ArrayList<Book> bookCollection = new ArrayList<Book>();

    //Constructor
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    //method to retrieve the title of a book
    public String getTitle() {
        return title;
    }

    //method to retrieve the author of the book
    public String getAuthor() {
        return author;
    }

    //method to retrieve the ISBN of the book
    public String getISBN() {
        return ISBN;
    }

    //method to add a book to collection
    public static void add_Book(Book UltimulMohican) {
        bookCollection.add(UltimulMohican);
    }

    //method to remove a book from collection
    public static void remove_Book(Book UltimulMohican) {
        bookCollection.remove(UltimulMohican);
    }

    //method to return the book collection
    public static ArrayList<Book> get_BookCollection(){
        return bookCollection;
    }


}
