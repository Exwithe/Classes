public class Person {

    private String name;
    private int size;
    private int iq;
    private String girlFriendsName;
    private Work work;




    public Person(String name, int size, int iq, String girlFriendsName) {
        this.name = name;
        this.size = size;
        this.iq = iq;
        this.girlFriendsName = girlFriendsName;

    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getIq() {
        return iq;
    }

    public String getGirlFriendsName() {
        return girlFriendsName;
    }

    public Work getWork() {
        return work;
    }
}
