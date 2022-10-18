package Section02.ProgrammingProjects;

import java.util.Random;

public class LotteryPrinter {

    public static void main(String[] args) {

        Random lottery = new Random();
        Integer firstNumber = lottery.nextInt(1,49);
        Integer secondNumber = lottery.nextInt(1,49);
        Integer thirdNumber = lottery.nextInt(1,49);
        Integer fourthNumber = lottery.nextInt(1,49);
        Integer fifthNumber = lottery.nextInt(1,49);
        Integer sixthNumber = lottery.nextInt(1,49);

        System.out.println("Play this combination—it’ll make you rich!");
        System.out.println(firstNumber+""+secondNumber+""+thirdNumber+""+fourthNumber+""+fifthNumber+""+sixthNumber);

    }

}
