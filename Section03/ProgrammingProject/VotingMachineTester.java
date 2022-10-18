package Section03.ProgrammingProject;

public class VotingMachineTester {

    public static void main(String[] args) {

        VotingMachine USElection = new VotingMachine();
        USElection.resultElection();
        USElection.voteDemocrat();
        USElection.voteDemocrat();
        USElection.voteDemocrat();
        USElection.voteRepublican();
        USElection.voteRepublican();
        USElection.resultElection();
        USElection.reset();
        USElection.resultElection();
    }

}
