package Section02.PracticeExercise;

import java.awt.*;

public class PerimterTester {

    public static void main(String[] args) {

        Rectangle box = new Rectangle(15, 15, 3000,1000);
        Double perimter = 2 * (box.getWidth() + box.getHeight());
        System.out.print("Perimeter : ");
        System.out.println(perimter);
        System.out.println("Expected : 8000.00");

    }

}
