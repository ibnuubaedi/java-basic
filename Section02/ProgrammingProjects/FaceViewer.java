package Section02.ProgrammingProjects;

import javax.swing.*;

public class FaceViewer {

    public static void main(String[] args) {

        FaceComponent component = new FaceComponent();

        JFrame frame = new JFrame();
        frame.setSize(300,300);
        frame.setTitle("Face");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
        frame.add(component);


    }

}
