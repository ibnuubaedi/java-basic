package Section02.ProgrammingProjects;

import javax.swing.*;

public class FourRectangleViewer {

    public static void main(String[] args) {

        FourRectanglePrinter component = new FourRectanglePrinter();

        JFrame frame = new JFrame();
        frame.add(component);
        frame.setSize(300,500);
        frame.setDefaultCloseOperation(3);
        frame.setTitle("Four Rectangle");
        frame.setVisible(true);

    }

}
