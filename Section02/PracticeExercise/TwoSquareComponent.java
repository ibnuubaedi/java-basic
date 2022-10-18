package Section02.PracticeExercise;

import javax.swing.*;
import java.awt.*;

public class TwoSquareComponent extends JComponent {

    public void paintComponent(Graphics g){

        Graphics2D g2 = (Graphics2D) g;

        Rectangle box = new Rectangle(5,10,200,200);
        g2.draw(box);

        box.translate(250,0);
        g2.draw(box);

        box.translate(0,250);
        g2.draw(box);
        g2.setColor(Color.PINK);
        g2.fill(box);

        box.translate(-250,0);
        Color magenta = new Color(255,0,255);
        g2.draw(box);
        g2.setColor(magenta.darker());
        g2.fill(box);

    }

}
