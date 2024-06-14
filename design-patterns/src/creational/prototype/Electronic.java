package creational.prototype;

public class Electronic implements Product {

    private String name;
    private String brand;
    private double price;

    public Electronic(String name, String brand, double price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    // Copy constructor
    public Electronic(Electronic prototype) {
        this.name = prototype.name;
        this.brand = prototype.brand;
        this.price = prototype.price;
    }

    @Override
    public Product clone() {
        return new Electronic(this);
    }

    @Override
    public String toString() {
        return "Electronic [name=" + name + ", brand=" + brand + ", price=" + price + "]";
    }
}
