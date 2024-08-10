package structural.flyweight;

public class Client {

    public static void main(String[] args) {

        FontFactory factory = new FontFactory();

        FontFlyweight arial = factory.getFont("Arial");
        arial.display("Hello, World!", 12, "Black");
        arial.display("Flyweight Pattern", 14, "Red");

        FontFlyweight timesNewRoman = factory.getFont("Times New Roman");
        timesNewRoman.display("Hello, World!", 12, "Black");
        timesNewRoman.display("Flyweight Pattern", 14, "Blue");

        System.out.println("Total Fonts created: " + factory.getTotalFonts());
    }
}

