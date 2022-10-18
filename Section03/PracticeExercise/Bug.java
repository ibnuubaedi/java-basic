package Section03.PracticeExercise;

/**
 * Bug move horizontal from left to right, but it can turn change direction.
 */
public class Bug {
    /**
     * Position of Bug.
     * Bug move from left to right, but it can turn change direction.
     */
    private double position;

    /**
     * Construct Bug with initial position.
     * @param initialPosition of the Bug.
     */
    public Bug(double initialPosition){
       this.position = initialPosition;
    }

    /**
     * Moves bug from left to right, change position 1 unit.
     */
    public void move(){
        this.position = this.position + 1;
    }

    /**
     * Turn bug position from right to left, change position 1 unit.
     */
    public void turn(){
        this.position = this.position - 1;
    }

    /**
     * Get current position of Bug.
     * @return current position of Bug.
     */
    public double getPosition(){
        return this.position;
    }
}
