package Section03.PracticeExercise;

public class BugTester {

    public static void main(String[] args) {

        Bug myBug = new Bug(1);
        myBug.move();
        myBug.move();
        myBug.move();
        myBug.turn();
        System.out.println(myBug.getPosition());
    }

}
