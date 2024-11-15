package PracticeCode.PolymorphismPractice.PokemonRestart;

public class Pokemon implements Attackable {
    private int hp;
    private int attack;
    private int defense;
    private int spAttack;
    private int spDefense;
    private int speed;
    private String name;

    public Pokemon() {
        hp = 10;
        attack = 10;
        defense = 10;
        spAttack = 10;
        spDefense = 10;
        speed = 10;
        name = "Default Pokemon";
    }

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

    public void attack1() {

    }
    public void attack2() {

    }
}
