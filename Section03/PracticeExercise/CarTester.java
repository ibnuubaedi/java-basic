package Section03.PracticeExercise;

public class CarTester {

    public static void main(String[] args) {

        Car nayaCar = new Car(60);
        nayaCar.addGas(10);
        nayaCar.drive(60);
        System.out.println(nayaCar.getGasInTank());
        nayaCar.drive(480);
        System.out.println(nayaCar.getGasInTank());

    }

}
