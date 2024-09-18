public class Charizard extends Pokemon {
    public Charizard() {
        super(78, 84, 78, 108,
                85, 100, "King");
    }

    public Charizard(int inputHp, int inputAttack, int inputDefense,
                   int inputSpAttack, int inputSpDefense, int inputSpeed, String inputName) {
        super(inputHp, inputAttack, inputDefense, inputSpAttack, inputSpDefense, inputSpeed, inputName);
    }

//    public void fireSpin(Pokemon opponent) {
//        if(opponent.getHp() >= 200) {
//            int resultingLife = opponent.getHp() - 200;
//        }
//        else if(opponent.getHp() < 200) {
//            opponent.setHp(0);
//        }
//    }

    public void braveWing(Pokemon opponent) {
        System.out.println(this.getName() + " USE BRAVE WING!");
        if(opponent.getHp() >= 60) {
            int resultingLife = opponent.getHp() - 60;
        }
        else if(opponent.getHp() < 60) {
            opponent.setHp(0);
        }
    }

//    public void roaringFlame(Pokemon opponent) {
//        if(opponent.getHp() >= 20) {
//            int resultingLife = opponent.getHp() - 20;
//        }
//        else if(opponent.getHp() < 20) {
//            opponent.setHp(0);
//        }
//    }
//
//    public void burn(Pokemon opponent) {
//        System.out.println(opponent.getName() + " is burned!");
//    }
}
