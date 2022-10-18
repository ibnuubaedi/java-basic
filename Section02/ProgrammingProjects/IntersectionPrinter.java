package Section02.ProgrammingProjects;

import javax.swing.*;
import java.awt.*;

public class IntersectionPrinter extends JComponent {

    public void paintComponent(Graphics g){

        Graphics2D g2 = (Graphics2D) g;

        Rectangle r1 = new Rectangle(10,10,50,100);
        Rectangle r2 = new Rectangle(35,85,100,50);
        Rectangle r3 = r1.intersection(r2);

        g2.draw(r1);
        g2.draw(r2);

        g2.setColor(Color.BLUE);
        g2.fill(r3);
        g2.draw(r3);

    }
}
