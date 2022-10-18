package Section02.ProgrammingProjects;

import javax.swing.*;
import java.awt.*;

public class CenteredSquaresPrinter extends JComponent {

    public void paintComponent(Graphics g){

        Graphics2D g2 = (Graphics2D) g;

        Rectangle box = new Rectangle(100,100,200,200);
        g2.draw(box);

        box.grow(100,100);
        g2.draw(box);

    }

}
