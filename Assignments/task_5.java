// Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, and
// methods to add and remove books from a collection.

class Book {
    String title;
    String author;
    String ISBN;

    // Constructors to initialize the attributes,
    // they allow you to set initial values for
    // the object's attributes and perform any setup required
    Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    // Getters to get the attributes
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    // Setters to set the attributes
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}