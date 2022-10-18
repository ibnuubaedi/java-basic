package Section02.ProgrammingProjects;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class FaceComponent extends JComponent {

    public void paintComponent(Graphics g){

        Graphics2D g2 = (Graphics2D) g;

        Ellipse2D.Double head = new Ellipse2D.Double(10,10,100,100);
        g2.draw(head);

        Ellipse2D.Double eyeLeft = new Ellipse2D.Double(30,40,10,10);
        g2.draw(eyeLeft);

        Ellipse2D.Double eyeRight = new Ellipse2D.Double(80,40,10,10);
        g2.draw(eyeRight);

        Line2D.Double mouth = new Line2D.Double(30,80,90,80);
        g2.draw(mouth);

    }
}
