public class Main {
    public static void main(String[] args) {
        Person marvin = new Person("Marvin", 174,122, "Janina");
        Person res = new Person("Res", 186, 99, "Sarina");
        Person remo = new Person("Remo", 172,118,"Error404");


        System.out.println(marvin.getName() + " is " + marvin.getSize() + " cm tall. His IQ is " + marvin.getIq() + " and his girlfriend is called " + marvin.getGirlFriendsName() + ".");
    }
}
