public class Main {
    public static void main(String[] args) {
        Person marvin = new Person("Marvin", 174,122, "Janina");
        Person res = new Person("Res", 186, 99, "Sarina");
        Person remo = new Person("Remo", 172,118,"Error404");
        Work marvinWork = new Work("Marvin", "computer scientist", 1300, 3);
        Work resWork = new Work("Res", "electrician", 4800, 2);
        Work remoWork = new Work("Remo", "electrician", 4800, 2);


        System.out.println(marvin.getName() + " is " + marvin.getSize() + " cm tall. His IQ is " + marvin.getIq() + " and his girlfriend is called " + marvin.getGirlFriendsName() + ".");
    }
}
