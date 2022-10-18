package Section03.ProgrammingProject;

public class StudentTester {

    public static void main(String[] args) {

        Student inayah = new Student("Inayah");
        inayah.addQuiz(100.0);
        inayah.addQuiz(50.0);
        inayah.addQuiz(65.0);
        System.out.println(inayah.getTotalScore());
        System.out.println(inayah.getAverageScore());

        Student ibnu = new Student("Ibnu");
        ibnu.addQuiz(80);
        ibnu.addQuiz(90);
        System.out.println(ibnu.getTotalScore());
        System.out.println(ibnu.getAverageScore());

    }

}
