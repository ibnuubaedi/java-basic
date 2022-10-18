package Section02.ProgrammingProjects;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class TrafficLigthComponent extends JComponent {

    public void paintComponent(Graphics g){

        Graphics2D g2 = (Graphics2D) g;

        Rectangle box = new Rectangle(20,20,60,160);
        g2.draw(box);
        g2.setColor(Color.BLACK);
        g2.fill(box);

        Ellipse2D.Double redLight = new Ellipse2D.Double(30,30,40,40);
        g2.setColor(Color.RED);
        g2.draw(redLight);
        g2.fill(redLight);

        Ellipse2D.Double yelloLight = new Ellipse2D.Double(30,80,40,40);
        g2.setColor(Color.YELLOW);
        g2.draw(yelloLight);
        g2.fill(yelloLight);

        Ellipse2D.Double greenLight = new Ellipse2D.Double(30,130,40,40);
        g2.setColor(Color.GREEN);
        g2.draw(greenLight);
        g2.fill(greenLight);

    }

}
