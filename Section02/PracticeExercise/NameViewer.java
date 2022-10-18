package Section02.PracticeExercise;

import javax.swing.*;

public class NameViewer {

    public void main(String[] args) {

        NameComponent component = new NameComponent();

        JFrame frame = new JFrame();
        frame.setTitle("Name in Box");
        frame.setSize(300,400);
        frame.add(component);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);

    }

}
