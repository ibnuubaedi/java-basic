package Section03.ProgrammingProject;

public class RoachSimulation {

    public static void main(String[] args) {
        RoachPopulation roach = new RoachPopulation(10);
        roach.breed();
        System.out.println(roach.getRoaches());
        roach.spary(10);
        System.out.println(roach.getRoaches());
    }

}
