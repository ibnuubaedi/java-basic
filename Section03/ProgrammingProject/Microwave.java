package Section03.ProgrammingProject;

/**
 * Class Microwave consist of button start, increasing time, increasing level and reset.
 */
public class Microwave {

    /**
     * Time of cooking in Microwave.
     */
    private double time;

    /**
     * Level of cooking in Microwave.
     */
    private double level;

    /**
     * Construct Microve with set time and level to zero.
     */
    public Microwave(){
        this.level = 0;
        this.time = 0;
    }

    /**
     * Set time cooking in Microwave.
     */
    public void setTime(double increaseTime){
        this.time = increaseTime;
    }

    /**
     * Set level cooking in Microwave.
     */
    public void setLevel(double level){
        this.level = level;
    }

    /**
     * Start cooking in Microwave.
     * Print status cooking with time and level.
     */
    public void start(){
        System.out.println("Cooking for " + this.time + " seconds at level " + this.level);
    }

    /**
     * Reset status Microwave to Zero.
     */
    public void reset(){
        this.level = 0;
        this.time = 0;
    }

}
