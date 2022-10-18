package Section02.ProgrammingProjects;

import javax.swing.*;

public class IntersectionViewer {

    public static void main(String[] args) {

        IntersectionPrinter component = new IntersectionPrinter();

        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setTitle("Intersection");
        frame.setDefaultCloseOperation(3);
        frame.add(component);


    }

}
