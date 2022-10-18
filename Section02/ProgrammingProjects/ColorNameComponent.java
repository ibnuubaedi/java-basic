package Section02.ProgrammingProjects;

import javax.swing.*;
import java.awt.*;

public class ColorNameComponent extends JComponent {

    public void paintComponent(Graphics g){

        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.RED);
        g2.drawString("RED",50,100);

        g2.setColor(Color.BLUE);
        g2.drawString("BLUE", 50,120);

        g2.setColor(Color.GREEN);
        g2.drawString("GREEN",50,140);

        g2.setColor(Color.PINK);
        g2.drawString("PINK", 50,160);

        g2.setColor(Color.BLACK);
        g2.drawString("BLACK", 50,180);

        g2.setColor(Color.CYAN);
        g2.drawString("CYAN",50,200);

        g2.setColor(Color.DARK_GRAY);
        g2.drawString("DARK GRAY",50,220);

        g2.setColor(Color.GRAY);
        g2.drawString("GRAY",50,240);

        g2.setColor(Color.LIGHT_GRAY);
        g2.drawString("LIGHT GRAY",50,260);

        g2.setColor(Color.MAGENTA);
        g2.drawString("MAGENTA",50,280);

        g2.setColor(Color.ORANGE);
        g2.drawString("ORANGE",50,300);

    }
}
