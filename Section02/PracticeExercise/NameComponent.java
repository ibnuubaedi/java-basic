package Section02.PracticeExercise;

import javax.swing.*;
import java.awt.*;

public class NameComponent extends JComponent {

    public void paintComponent (Graphics g){

        Graphics2D g2 = (Graphics2D) g;

        Rectangle box = new Rectangle(5,10,300,150);
        g2.draw(box);
        g2.setColor(Color.BLUE);
        g2.fill(box);
        g2.setColor(Color.RED);
        g2.drawString("Inayah", 150,75);


    }

}
