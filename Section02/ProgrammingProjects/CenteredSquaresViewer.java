package Section02.ProgrammingProjects;

import javax.swing.*;

public class CenteredSquaresViewer {

    public static void main(String[] args) {

        CenteredSquaresPrinter component = new CenteredSquaresPrinter();

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setTitle("Centered Square");
        frame.setDefaultCloseOperation(3);
        frame.add(component);
        frame.setSize(1000,1000);
    }

}
