package PokemonProject;

import java.util.ArrayList;

public class TesterStadium {
    public static void main(String[] args) {
        ArrayList<Pokemon> pokemon = new ArrayList<>();
        Pikachu jimmy = new Pikachu();
        jimmy.setName("Jimmy");
        pokemon.add(jimmy);
        Charizard king = new Charizard();
        king.setName("King");
        pokemon.add(king);
        Delphox delphino = new Delphox();
        delphino.setName("Delphino");
        pokemon.add(delphino);
        Regigigas reggie = new Regigigas();
        reggie.setName("Reggie");
        pokemon.add(reggie);

//        System.out.println("Battle Music Initialized...");
//        System.out.println("King HP: " + king.getHp());
//        jimmy.thunderbolt(king);
//        System.out.println("Jimmy attack King with thunderbolt:");
//        System.out.println("King HP: " + king.getHp());

        System.out.println(jimmy.compareTo(king));
    }
}
