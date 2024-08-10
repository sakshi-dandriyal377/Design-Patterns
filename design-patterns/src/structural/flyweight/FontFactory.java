package structural.flyweight;


import java.util.HashMap;
import java.util.Map;

public class FontFactory {

    private final Map<String, FontFlyweight> fonts = new HashMap<>();

    public FontFlyweight getFont(String fontName) {
        FontFlyweight font = fonts.get(fontName);
        if (font == null) {
            font = new Font(fontName);
            fonts.put(fontName, font);
        }
        return font;
    }

    public int getTotalFonts() {
        return fonts.size();
    }
}

