package software.ulpgc.colorsviewer.swing;

import software.ulpgc.colorsviewer.Image;
import software.ulpgc.colorsviewer.ImagePresenter;
import software.ulpgc.colorsviewer.mocks.MockImageLoader;

public class Main {
    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
        ImagePresenter presenter = new ImagePresenter(frame.getImageDisplay());
        presenter.show(image());
        frame.setVisible(true);
    }

    private static Image image() {
        return new MockImageLoader().load();
    }
}
