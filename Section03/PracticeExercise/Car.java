package Section03.PracticeExercise;

public class Car {

    private double efficient;
    private double gasInTank;

    public Car(double fuelEffeciency){
        this.efficient = fuelEffeciency;
    }

    public void addGas(double liter){
        this.gasInTank = this.gasInTank + liter;
    }

    public void drive(double speed){
        double consumeGas = speed / this.efficient;
        this.gasInTank = this.gasInTank - consumeGas;
    }

    public double getGasInTank(){
        return this.gasInTank;
    }

}
