package Section03.ProgrammingProject;

/**
 * Voting Machine for election.
 */
public class VotingMachine {

    /**
     * Democrat party vote count.
     */
    private int democrat;

    /**
     * Republican party vote count.
     */
    private int republican;

    /**
     * Construct Voting Machine to set party to zero.
     */
    public VotingMachine(){
        this.democrat = 0;
        this.republican = 0;
    }

    /**
     * Reset party vote to zero.
     */
    public void reset(){
        this.democrat = 0;
        this.republican = 0;
    }

    /**
     * Vote party democrat.
     */
    public void voteDemocrat(){
        this.democrat = this.democrat + 1;
    }

    /**
     * Vote party Republican.
     */
    public void voteRepublican(){
        this.republican = this.republican + 1;
    }

    /**
     * Get result of election
     */
    public void resultElection(){
        System.out.println("Democrat : " + this.democrat + " voted");
        System.out.println("Republican : " + this.republican + " voted");
    }
}
