package Section02.Content;

import javax.swing.*;

public class RectangleViewer {

    public static void main(String[] args) {

        RectangleComponent component = new RectangleComponent();

        JFrame frame = new JFrame();
        frame.setTitle("Two rectangles");
        frame.setSize(300, 400);
        frame.add(component);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}
