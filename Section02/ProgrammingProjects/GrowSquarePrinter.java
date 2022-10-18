package Section02.ProgrammingProjects;

import javax.swing.*;
import java.awt.*;

public class GrowSquarePrinter extends JComponent {

    public void paintComponent(Graphics g){

        Graphics2D g2 = (Graphics2D) g;

        Rectangle box = new Rectangle(100,100,50,50);
        g2.draw(box);

        box.grow(25,25);
        box.setLocation(100,100);
        g2.draw(box);

    }
}
