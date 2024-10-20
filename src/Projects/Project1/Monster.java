package Projects.Project1;

public abstract class Monster implements Interactable {
    private String monsterName;
    private int attack;
    private int health;
    private int defense;
    private int speed;

    public abstract void attack();

    public String getMonsterName() {
        return monsterName;
    }
    public void setMonsterName(String newMonsterName) {
        monsterName = newMonsterName;
    }

    public int getAttack() {
        return attack;
    }
    public void setAttack(int newAttack) {
        attack = newAttack;
    }

    public int getHealth() {
        return health;
    }
    public void setHealth(int newHealth) {
        health = newHealth;
    }

    public int getDefense() {
        return defense;
    }
    public void setDefense(int newDefense) {
        defense = newDefense;
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    }
}
