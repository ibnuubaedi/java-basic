package Section03.ProgrammingProject;

public class PersonTester {

    public static void main(String[] args) {

        Person ibnu = new Person("Ibnu");
        Person inayah = new Person("Inayah");
        Person ali = new Person("Ali");

        ibnu.befriend(inayah);
        ibnu.befriend(ali);
        System.out.println(ibnu.getFriends());
        System.out.println("Numbers of Friends : " + ibnu.getCountFriends());
        ibnu.unfriend(ali);
        System.out.println(ibnu.getFriends());
        System.out.println("Numbers of Friends : " + ibnu.getCountFriends());
    }

}
