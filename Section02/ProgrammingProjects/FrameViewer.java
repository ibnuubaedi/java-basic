package Section02.ProgrammingProjects;

import javax.swing.*;
import java.awt.*;

public class FrameViewer {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(200,200);
        JLabel label = new JLabel("Hello World!");
        label.setOpaque(true);
        label.setBackground(Color.PINK);
        frame.add(label);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);

        frame.setSize(400,400);
        label.setText("Hello, Inayah!");
        label.setBackground(Color.GREEN);
        
    }

}
