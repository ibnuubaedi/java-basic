package Section03.PracticeExercise;

/**
 * Moth fly straight line to point of light.
 * When it fly, its new position between old position and point of light.
 */

public class Moth {
    /**
     * Position of Moth.
     */
    private double position;

    /**
     * Construct Moth with initial position.
     * @param intialPosition of Moth.
     */
    public Moth(double intialPosition){
        this.position = intialPosition;
    }

    /**
     * Move position Moth.
     * When Moth move to point of light, its new position between old position and point of light.
     */
    public void moveToLight(double lightPosition){
        double newPosition = (this.position + lightPosition) / 2;
        this.position = newPosition;
    }

    /**
     * Get current position of Moth.
     * @return current position of Moth.
     */
    public double getPosition(){
        return this.position;
    }
}
