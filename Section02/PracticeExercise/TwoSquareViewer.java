package Section02.PracticeExercise;

import javax.swing.*;

public class TwoSquareViewer {

    public static void main(String[] args) {

        TwoSquareComponent component = new TwoSquareComponent();
        JFrame frame = new JFrame();
        frame.add(component);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setTitle("Two Square");
        frame.setDefaultCloseOperation(3);
    }

}
