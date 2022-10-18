package Section02.ProgrammingProjects;

import javax.swing.*;

public class GrowSquareViewer {

    public static void main(String[] args) {

        GrowSquarePrinter component = new GrowSquarePrinter();

        JFrame frame = new JFrame();
        frame.add(component);
        frame.setSize(300,500);
        frame.setDefaultCloseOperation(3);
        frame.setTitle("Four Rectangle");
        frame.setVisible(true);

    }

}
