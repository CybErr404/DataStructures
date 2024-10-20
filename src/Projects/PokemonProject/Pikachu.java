package PokemonProject;

public class Pikachu extends Pokemon {
    public Pikachu() {
        super(35, 55, 30, 50,
                40, 90, "Jimmy");
    }

    public Pikachu(int inputHp, int inputAttack, int inputDefense,
                   int inputSpAttack, int inputSpDefense, int inputSpeed, String inputName) {
        super(inputHp, inputAttack, inputDefense, inputSpAttack, inputSpDefense, inputSpeed, inputName);
    }

    public void thunderbolt(Pokemon anyPoorPokemon) {
        //THIS means use THIS OBJECT'S attack. not somePoorPikachu.
        System.out.println(this.getName() + " USE THUNDERBOLT!");
        int resultingLife = anyPoorPokemon.getHp() - (Math.abs(this.getAttack() - anyPoorPokemon.getDefense()));
        anyPoorPokemon.setHp(resultingLife);
        //NEED TO DO MATH HERE.
        //if defense is too high, they shouldn't gain health from being attacked.
    }

//    public void quickAttack(Pokemon opponent) {
//        if(opponent.getHp() >= 20) {
//            int resultingLife = opponent.getHp() - 20;
//        }
//        else if(opponent.getHp() < 20) {
//            opponent.setHp(0);
//        }
//    }
//
//    public void pikaBolt(Pokemon opponent) {
//        if(opponent.getHp() >= 50) {
//            int resultingLife = opponent.getHp() - 50;
//        }
//        else if(opponent.getHp() < 50) {
//            opponent.setHp(0);
//        }
//    }
//
//    public void nuzzle(Pokemon opponent) {
//        System.out.println(opponent.getName() + " is paralyzed!");
//    }
}
