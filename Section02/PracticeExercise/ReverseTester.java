package Section02.PracticeExercise;

public class ReverseTester {

    public static void main(String[] args) {

        String name = "Ibnu Ubaedi";
        StringBuilder rev = new StringBuilder(name);
        String revName = rev.reverse().toString();
        System.out.println(revName);

    }
}
