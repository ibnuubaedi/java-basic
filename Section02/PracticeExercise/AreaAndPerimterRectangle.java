package Section02.PracticeExercise;

import java.awt.*;

public class AreaAndPerimterRectangle {

    public static void main(String[] args) {

        Rectangle box = new Rectangle(7,6);
        Double area = box.getHeight() * box.getWidth();
        System.out.println(" h: " + box.getHeight() + " w: " + box.getWidth() + " a: " + area);

        Rectangle box2 = new Rectangle(10,11);
        Double perimter = 2 * (box2.getWidth() + box2.getHeight());
        System.out.println("Height : " + box2.getHeight());
        System.out.println("Width : " + box2.getWidth());
        System.out.println("Perimeter : " + perimter);


    }

}

