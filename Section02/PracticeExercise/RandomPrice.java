package Section02.PracticeExercise;

import java.util.Random;

public class RandomPrice {

    public static void main(String[] args) {

        Random random = new Random();
        Float randomPrice = random.nextFloat(10, 20);
        System.out.println(randomPrice);
    }

}
