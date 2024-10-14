package Project1;

public class Player {
    private int level;
    private int attack;
    private int health;
    private int defense;
    private int speed;

    //will balance this later if it is not already balanced.
    public Player() {
        level = 1;
        attack = 10;
        health = 10;
        defense = 5;
        speed = 7;
    }

    public void setLevel(int newLevel) {
        level = newLevel;
    }
    public int getLevel() {
        return level;
    }

    public void setAttack(int newAttack) {
        attack = newAttack;
    }
    public int getAttack() {
        return attack;
    }

    public void setHealth(int newHealth) {
        health = newHealth;
    }
    public int getHealth() { return health; }

    public void setDefense(int newDefense) {
        defense = newDefense;
    }
    public int getDefense() {
        return defense;
    }

    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    }
    public int getSpeed() {
        return speed;
    }
}
