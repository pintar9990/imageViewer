package software.ulpgc.colorsviewer;

public interface Image {
    String id();
    Image next();
    Image prev();

}
