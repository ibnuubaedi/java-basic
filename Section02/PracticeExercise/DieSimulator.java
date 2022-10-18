package Section02.PracticeExercise;

import java.util.Random;

public class DieSimulator {

    public static void main(String[] args) {

        Random dice = new Random();
        Integer castTheDice = dice.nextInt(6);
        System.out.println(castTheDice);

    }

}
