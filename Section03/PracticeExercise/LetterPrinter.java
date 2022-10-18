package Section03.PracticeExercise;

public class LetterPrinter {

    public static void main(String[] args) {

        Letter loveMessage = new Letter("Ibnu", "Inayah");
        loveMessage.addLine("I've been thinking about you a lot today.\n");
        loveMessage.addLine("and i wanted to tell you how i feel.\n");
        System.out.println(loveMessage.getText());

    }

}
