package Section02.Content;

import javax.swing.*;

public class FaceViewer {

    public static void main(String[] args) {

        FaceComponent component = new FaceComponent();

        JFrame frame = new JFrame();
        frame.setSize(150, 250);
        frame.setTitle("A Alien face");
        frame.add(component);
        frame.setVisible(true);

    }

}
