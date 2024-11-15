package PracticeCode.PolymorphismPractice.PokemonRestart;

public class Sprigatito extends Pokemon implements Attackable {
    private String pokemonName;
    private String attackName;

    public Sprigatito() {

    }

    public void attack1() {

    }
    public void attack2() {

    }

    public void setPokemonName(String newPokemonName) {
        pokemonName = newPokemonName;
    }
    public String getPokemonName() {
        return pokemonName;
    }

    public void setAttackName(String newAttackName) {
        attackName = newAttackName;
    }
    public String getAttackName() {
        return attackName;
    }
}
