package Section02.ProgrammingProjects;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class LineDistanceComponent extends JComponent {

    public void paintComponent(Graphics g){

       /* Graphics2D g2 = (Graphics2D) g;

        Line2D.Double firstLine = new Line2D.Double(10,100,60,100);
        Line2D.Double secondLine = new Line2D.Double(10,200,60,200);
        g2.draw(firstLine);
        g2.draw(secondLine);

        Ellipse2D.Double firstPoin = new Ellipse2D.Double(100,100,1,1);
        Ellipse2D.Double secondPoin = new Ellipse2D.Double(150,150,1,1);
        Ellipse2D.Double thirdPoin = new Ellipse2D.Double(250,50,1,1);
        g2.draw(firstPoin);
        g2.draw(secondPoin);
        g2.draw(thirdPoin);

        Line2D.Double distanceFirstLineToFirstPoint = firstLine.ptSegDist(firstPoin);
        Line2D.Double distanceFirstLineToSecondPoint = firstLine.ptSegDist(secondPoin);
        Line2D.Double distanceFirstLineToThirdPoint = firstLine.ptSegDist(thirdPoin);

        Double distanceSecondLineToFirstPoint = secondLine.ptSegDist(firstPoin);
        Double distanceSecondLineToSecondPoint = secondLine.ptSegDist(secondPoin);
        Double distanceSecondLineToThirdPoint = secondLine.ptSegDist(thirdPoin);

        g2.drawString("Distance : " + distanceFirstLineToFirstPoint, firstPoin.getX(), firstPoin.getY());
        g2.drawString("Distance : " + distanceFirstLineToSecondPoint,secondPoin.getX(), secondPoin.getY());
        g2.drawString("Distance : " + distanceFirstLineToThirdPoint, thirdPoin.getX(), thirdPoin.getY());

        g2.drawString("Distance : ",distanceSecondLineToFirstPoint, firstPoin.getX(), firstPoin.getY());
        g2.drawString("Distance : ",distanceSecondLineToSecondPoint, secondPoin.getX(), secondPoin.getY());
        g2.drawString("Distance : ",distanceSecondLineToThirdPoint, secondPoin.getX(), secondPoin.getY());


        */
    }

}
