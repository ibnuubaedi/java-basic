package Section02.PracticeExercise;

import java.awt.*;

public class AreaTester {

    public static void main(String[] args) {

        Rectangle box = new Rectangle(10,10,200,100);
        Double area = box.getHeight() * box.getWidth();
        System.out.print("Area : ");
        System.out.println(area);
        System.out.println("Expected : 20000.00");
    }

}
