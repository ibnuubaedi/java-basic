package Section03.ProgrammingProject;

public class BalloonTester {

    public static void main(String[] args) {
        Balloon myBalloon = new Balloon();
        myBalloon.inflate(10);
        System.out.println(myBalloon.getVolume());
    }

}
