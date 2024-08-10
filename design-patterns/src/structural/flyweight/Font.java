package structural.flyweight;

public class Font implements FontFlyweight {

    private final String fontName;

    public Font(String fontName) {
        this.fontName = fontName;
    }

    @Override
    public void display(String text, int size, String color) {
        System.out.println("Displaying text: '" + text + "' with font: " + fontName + ", size: " + size + ", color: " + color);
    }
}

