package creational.prototype;

public class Book implements Product {

    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Copy constructor
    public Book(Book prototype) {
        this.title = prototype.title;
        this.author = prototype.author;
        this.price = prototype.price;
    }

    @Override
    public Product clone() {
        return new Book(this);
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
    }
}
