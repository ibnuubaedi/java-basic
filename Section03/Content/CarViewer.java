package Section03.Content;

import javax.swing.*;

public class CarViewer {

    public static void main(String[] args) {

        CarComponent component = new CarComponent();

        JFrame frame = new JFrame();
        frame.setSize(300,400);
        frame.setVisible(true);
        frame.setTitle("Car");
        frame.setDefaultCloseOperation(3);
        frame.add(component);

    }
}
