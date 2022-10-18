package Section02.PracticeExercise;

import javax.swing.*;
import java.awt.*;

public class BrighterDemo {

    public static void main(String[] args) {

       Color myColor = new Color(50,100,150);
       Color myBrightColor = myColor.brighter();

        JFrame frame = new JFrame();
        frame.setSize(200,200);
        frame.getContentPane().setBackground(myBrightColor);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }

}
