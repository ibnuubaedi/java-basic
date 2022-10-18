package Section03.ProgrammingProject;

public class MicrowaveTester {

    public static void main(String[] args) {

        Microwave myMicrowave = new Microwave();
        myMicrowave.start();
        myMicrowave.setLevel(1);
        myMicrowave.start();
        myMicrowave.setTime(30);
        myMicrowave.start();
        myMicrowave.reset();
        myMicrowave.start();

    }

}
