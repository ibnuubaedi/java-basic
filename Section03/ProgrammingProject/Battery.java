package Section03.ProgrammingProject;

/**
 * Battery consist of capacity, drain, and full charge.
 */
public class Battery {

    /**
     * Capacity of battery.
     */
    private double capacity;

    /**
     * Maximum capacity of battery.
     */
    private double maxCapacity;

    /**
     * Construct Battery with set capacity and maximum capacity.
     */
    public Battery(double capacity){
        this.capacity = capacity;
        this.maxCapacity = capacity;
    }

    /**
     * Drain capacity of Battery.
     * @param amount of drain.
     */
    public void drain(double amount){
        this.capacity = this.capacity - amount;
    }

    /**
     * Charge capacity Battery to full (original capacity).
     */
    public void charge(){
        this.capacity = this.maxCapacity;
    }

    /**
     * Get current capacity of Battery.
     * @return current capacity.
     */
    public double getRemainingCapacity(){
        return this.capacity;
    }
}
