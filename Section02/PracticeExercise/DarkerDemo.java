package Section02.PracticeExercise;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class DarkerDemo {

    public static void main(String[] args) {

        Color myColor = new Color(50,100,150);
        Color myDarkColor = myColor.darker();

        JFrame frame = new JFrame();
        frame.setSize(200,200);
        frame.getContentPane().setBackground(myDarkColor);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
}
