package Projects.PokemonProject;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Pokemon implements CanAttack, CompareTo {
    private int hp;
    private int attack;
    private int defense;
    private int spAttack;
    private int spDefense;
    private int speed;
    private String name;

    public Pokemon(int userHp, int userAttack, int userDefense,
                   int userSpAttack, int userSpDefense, int userSpeed, String userName) {
        hp = userHp;
        attack = userAttack;
        defense = userDefense;
        spAttack = userSpAttack;
        spDefense = userSpDefense;
        speed = userSpeed;
        name = userName;
    }

    public int getHp() {
        return hp;
    }
    public void setHp(int inputHp) {
        hp = inputHp;
    }

    public int getAttack() {
        return attack;
    }
    public void setAttack(int inputAttack) {
        attack = inputAttack;
    }

    public int getDefense() {
        return defense;
    }
    public void setDefense(int inputDefense) {
        defense = inputDefense;
    }

    public int getSpAttack() {
        return spAttack;
    }
    public void setSpAttack(int inputSpAttack) {
        spAttack = inputSpAttack;
    }

    public int getSpDefense() {
        return spDefense;
    }
    public void setSpDefense(int inputSpDefense) {
        spDefense = inputSpDefense;
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int inputSpeed) {
        speed = inputSpeed;
    }

    public String getName() {
        return name;
    }
    public void setName(String inputName) {
        name = inputName;
    }

    public void winner(Pokemon ally, Pokemon opponent) {
        if(opponent.getHp() <= 0) {
            System.out.println(ally.getName() + " is the winner!");
        }
    }

    @Override
    public void attack() {

    }

    @Override
    public boolean equals(Object obj) {
        //typecasting
        Pokemon temp = (Pokemon) obj;
        if(this.getAttack() == temp.getAttack() && this.getHp() == temp.getHp()
            && this.getDefense() == temp.getDefense() && this.getSpAttack() == temp.getSpAttack()
            && this.getSpDefense() == temp.getSpDefense() && this.getSpeed() == temp.getSpeed()
            && Objects.equals(this.getName(), temp.getName())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int compareTo(Object obj) {
        Pokemon temp = null;
        if(obj instanceof Pokemon) {
            temp = (Pokemon) obj;
        } else {
            return -10000;
        }

        if(this.getSpeed() > temp.getSpeed()) {
            return 1;
        } else if(this.getSpeed() == temp.getSpeed()) {
            return 0;
        } else {
            return -1;
        }
    }

    public String runAttacks(ArrayList<Pokemon> pokemonList) {
        //array list of pokemon.
        //want to cycle through each one using attacks until they are defeated.
        //last one standing, wins.

        for(int i = 0; i < pokemonList.size(); i++) {
            if(pokemonList.get(i).getHp() == 0) {
                pokemonList.remove(i);
            }
            else if (pokemonList.get(i).getHp() != 0) {
                if(pokemonList.get(i) instanceof Pikachu) {
                    ((Pikachu) pokemonList.get(i)).thunderbolt(pokemonList.get(i + 1));
                }
                else if (pokemonList.get(i) instanceof Charizard) {
                    ((Charizard) pokemonList.get(i)).braveWing(pokemonList.get(i + 1));
                }
                else if (pokemonList.get(i) instanceof Delphox) {
                    ((Delphox) pokemonList.get(i)).wonderFlare(pokemonList.get(i + 1));
                }
                else if (pokemonList.get(i) instanceof Regigigas) {
                    ((Regigigas) pokemonList.get(i)).daunt(pokemonList.get(0));
                }
            }
        }
        return "The winner is " + pokemonList.get(0).getName() + "!";
    }
}
