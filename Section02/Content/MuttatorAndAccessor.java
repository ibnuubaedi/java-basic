package Section02.Content;

import java.awt.*;

public class MuttatorAndAccessor {

    public static void main(String[] args) {

        Rectangle box = new Rectangle(5,10,20,30);

        //Accessor
        Double widthBox = box.getWidth();
        System.out.println(widthBox);

        box.translate(15, 25);
        System.out.println(box);


    }

}
