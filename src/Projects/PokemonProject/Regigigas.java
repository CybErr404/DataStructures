package Projects.PokemonProject;

public class Regigigas extends Pokemon {
    public Regigigas() {
        super(110, 116, 110, 80,
                110, 100, "Reggie");
    }

    public Regigigas(int inputHp, int inputAttack, int inputDefense,
                   int inputSpAttack, int inputSpDefense, int inputSpeed, String inputName) {
        super(inputHp, inputAttack, inputDefense, inputSpAttack, inputSpDefense, inputSpeed, inputName);
    }

    public void daunt(Pokemon opponent) {
        System.out.println(this.getName() + " USE DAUNT!");
        if(opponent.getHp() >= 80) {
            int resultingLife = opponent.getHp() - 80;
        }
        else if(opponent.getHp() < 80) {
            opponent.setHp(0);
        }
    }
}
