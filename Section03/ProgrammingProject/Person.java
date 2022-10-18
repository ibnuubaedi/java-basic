package Section03.ProgrammingProject;

/**
 * Class person consist of name and friends.
 */
public class Person {
    /**
     * Name of person.
     */
    private String name;

    /**
     * Friends of person.
     */
    private String friends;

    /**
     * Numbers of friends.
     */
    private int numberOfFriends;

    /**
     * Construct Person with name and without friends.
     */
    public Person(String name){
        this.name = name;
        this.friends = "";
        this.numberOfFriends = 0;
    }

    /**
     * Add friend to list.
     * @param p to add friend list.
     */
    public void befriend(Person p){
        this.friends = this.friends.concat(" ").concat(p.name);
        this.numberOfFriends = this.numberOfFriends + 1;
    }

    /**
     * Remove friend from list.
     * @param p to remove friend from list.
     */
    public void unfriend(Person p){
        this.friends = this.friends.replace(p.name,"");
        this.numberOfFriends = this.numberOfFriends - 1;
    }

    /**
     * Get friends name from list.
     * @return friends name.
     */
    public String getFriends(){
        return this.friends;
    }

    /**
     * Get numbers of friend.
     * @return number of friend.
     */
    public int getCountFriends(){
        return this.numberOfFriends;
    }
}
