package Section03.ProgrammingProject;

/**
 * Balloon class is used to calculate the volume of balloons.
 */
public class Balloon{

    /**
     * Radius of balloon.
     */
    private double radius;

    /**
     * Construct balloon from radius 0.
     */
    public Balloon(){
        this.radius = 0;
    }

    /**
     * Inflate balloon so radius is changed.
     */
    public void inflate(double amount){
        this.radius = amount;
    }

    /**
     * Calculate volume balloon.
     * @return volume of balloon.
     */
    public double getVolume(){
        double volumeOfBalloon = Math.PI * (this.radius * this.radius * this.radius) * 4 / 3;
        return volumeOfBalloon;
    }

}
