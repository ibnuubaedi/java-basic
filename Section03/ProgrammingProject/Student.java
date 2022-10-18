package Section03.ProgrammingProject;

/**
 * Class student consist name and total quiz score.
 */
public class Student {
    /**
     * Name of student.
     */
    private String name;

    /**
     * Total quiz score.
     */
    private double totalQuizScore;

    /**
     * Numbers of quiz.
     */
    private double numberOfQuiz;

    /**
     * Construct Student with set Name and set other is zero.
     * @param name of student.
     */
    public Student(String name){
        this.name = name;
        this.numberOfQuiz = 0;
        this.totalQuizScore = 0;
    }

    /**
     * Add score of quiz.
     * @param score of quiz.
     */
    public void addQuiz(double score){
        this.totalQuizScore = this.totalQuizScore + score;
        this.numberOfQuiz = this.numberOfQuiz + 1;
    }

    /**
     * Get total quiz score.
     * @return total score.
     */
    public double getTotalScore(){
        return this.totalQuizScore;
    }

    /**
     * Get average quiz score.
     * @return average score.
     */
    public double getAverageScore(){
        double avergageScore = this.totalQuizScore / this.numberOfQuiz;
        return avergageScore;
    }
}
