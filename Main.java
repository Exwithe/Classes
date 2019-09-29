public class Main {
    public static void main(String[] args) {
        Marvin marvin = new Marvin("Marvin", 174,122, "Janina");
        Res res = new Res("Res", 186, 99, "Sarina");
        Remo remo = new Remo("Remo", 172,118,"Error404");


        System.out.println(marvin.getName() + " is " + marvin.getSize() + " cm tall. His IQ is " + marvin.getIq() + " and his girlfriend is called " + marvin.getGirlFriendsName() + ".");
    }
}
