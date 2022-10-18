package Section02.Content;

import java.awt.*;

public class MoveTester {

    public static void main(String[] args) {

        Rectangle box = new Rectangle(5,10,20,30);

        box.translate(15, 20);

        System.out.print("x : ");
        System.out.println(box.getX());
        System.out.println("Expected : 20");

        System.out.print("y : ");
        System.out.println(box.getY());
        System.out.println("Expected : 30");


    }

}
