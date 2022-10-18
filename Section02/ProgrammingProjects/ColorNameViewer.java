package Section02.ProgrammingProjects;

import javax.swing.*;

public class ColorNameViewer {

    public static void main(String[] args) {

        ColorNameComponent component = new ColorNameComponent();

        JFrame frame = new JFrame();
        frame.setTitle("Color Name");
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(3);
        frame.add(component);

    }

}
