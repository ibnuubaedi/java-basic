package Section02.ProgrammingProjects;

import javax.sound.sampled.Line;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.GregorianCalendar;

public class LineDistanceTester {

    public static void main(String[] args) {

        Line2D.Double firstLine = new Line2D.Double(10,100,60,100);
        Line2D.Double secondLine = new Line2D.Double(10,200,60,200);

        Point2D.Double firstPoin = new Point2D.Double(100,100);
        Point2D.Double secondPoin = new Point2D.Double(150,150);
        Point2D.Double thirdPoin = new Point2D.Double(250,50);

        System.out.println(firstLine.ptSegDist(firstPoin));
        System.out.println(firstLine.ptSegDist(secondPoin));
        System.out.println(firstLine.ptSegDist(thirdPoin));

        System.out.println(secondLine.ptSegDist(firstPoin));
        System.out.println(secondLine.ptSegDist(secondPoin));
        System.out.println(secondLine.ptSegDist(thirdPoin));

    }

}
