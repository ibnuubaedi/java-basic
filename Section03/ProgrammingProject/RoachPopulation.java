package Section03.ProgrammingProject;

/**
 * Population of Roach.
 * Roach breed to double population.
 */
public class RoachPopulation {
    /**
     * Number of Roach.
     */
    private double numberOfRoach;

    /**
     * Construct of Roach with initial Roach.
     * @param initialRoach
     */
    public RoachPopulation(double initialRoach){
        this.numberOfRoach = initialRoach;
    }

    /**
     * Breed of Roach.
     * Breed to double population of Roach.
     */
    public void breed(){
        this.numberOfRoach = this.numberOfRoach * 2;
    }

    /**
     * Spray to Roach.
     * Reduce numbers of Roach with the percentage
     * @param percent of reduce Roach.
     */
    public void spary(double percent){
        double reduceRoach = this.numberOfRoach * percent / 100;
        this.numberOfRoach = this.numberOfRoach - reduceRoach;
    }

    /**
     * Get numbers of Roach.
     * @return current of roach.
     */
    public double getRoaches(){
        return this.numberOfRoach;
    }
}
