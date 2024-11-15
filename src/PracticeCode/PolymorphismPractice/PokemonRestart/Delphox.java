package PracticeCode.PolymorphismPractice.PokemonRestart;

public class Delphox extends Pokemon implements Attackable {
    private String pokemonName;
    private String attackName;

    public Delphox() {

    }

    public void attack1() {

    }

    public void attack2() {

    }

    public void setPokemonName(String newName) {
        pokemonName = newName;
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
