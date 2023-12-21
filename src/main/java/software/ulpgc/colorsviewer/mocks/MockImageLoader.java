package software.ulpgc.colorsviewer.mocks;

import software.ulpgc.colorsviewer.Image;
import software.ulpgc.colorsviewer.ImageLoader;

public class MockImageLoader implements ImageLoader {
    private final String[] ids = new String[] {"red","green","blue","yellow","white"};
    @Override
    public Image load() {
        return imageAt(0);
    }

    private Image imageAt(int i) {
        return new Image() {
            @Override
            public String id() {
                return ids[i];
            }

            @Override
            public Image next() {
                return imageAt((i + 1) % ids.length);
            }

            @Override
            public Image prev() {
                return imageAt(i > 0 ? i -1 : ids.length-1);
            }
        };
    }
}
