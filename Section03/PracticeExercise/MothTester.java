package Section03.PracticeExercise;

public class MothTester {

    public static void main(String[] args) {

        Moth myMoth = new Moth(10);
        myMoth.moveToLight(20);
        System.out.println(myMoth.getPosition());
    }

}
