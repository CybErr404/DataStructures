package Projects.PokemonProject;

public class Delphox extends Pokemon {
    public Delphox() {
        super(75, 69, 72, 114,
                100, 104, "Delphino");
    }

    public Delphox(int inputHp, int inputAttack, int inputDefense,
                     int inputSpAttack, int inputSpDefense, int inputSpeed, String inputName) {
        super(inputHp, inputAttack, inputDefense, inputSpAttack, inputSpDefense, inputSpeed, inputName);
    }

    public void wonderFlare(Pokemon opponent) {
        System.out.println(this.getName() + " USE WONDER FLARE!");
        if(opponent.getHp() >= 80) {
            int resultingLife = opponent.getHp() - 80;
        }
        else if(opponent.getHp() < 80) {
            opponent.setHp(0);
        }
    }
}
