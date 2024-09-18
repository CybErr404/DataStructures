public class TesterStadium {
    public static void main(String[] args) {
        Pikachu jimmy = new Pikachu();
        jimmy.setName("Jimmy");
        Charizard king = new Charizard();
        king.setName("King");
        Delphox delphino = new Delphox();
        delphino.setName("Delphino");
        Regigigas reggie = new Regigigas();
        reggie.setName("Reggie");

//        System.out.println("Battle Music Initialized...");
//        System.out.println("King HP: " + king.getHp());
//        jimmy.thunderbolt(king);
//        System.out.println("Jimmy attack King with thunderbolt:");
//        System.out.println("King HP: " + king.getHp());

        System.out.println(jimmy.compareTo(king));
    }
}
