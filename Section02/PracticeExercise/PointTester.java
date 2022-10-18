package Section02.PracticeExercise;

import java.awt.*;

public class PointTester {

    public static void main(String[] args) {

        Point first = new Point(3,4);
        Point second = new Point(-3,-4);

        var distance = first.distance(second);

        System.out.println(distance);
    }

}
