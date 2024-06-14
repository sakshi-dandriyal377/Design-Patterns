package creational.prototype;

public class PrototypePatternExample {

    public static void main(String[] args) {

        Book originalBook = new Book("Design Patterns", "Erich Gamma", 40.00);
        Electronic originalElectronic = new Electronic("Smartphone", "BrandX", 299.99);

        Book clonedBook = (Book) originalBook.clone();
        Electronic clonedElectronic = (Electronic) originalElectronic.clone();

        System.out.println(originalBook);
        System.out.println(clonedBook);

        System.out.println(originalElectronic);
        System.out.println(clonedElectronic);
    }
}
