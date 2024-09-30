package PracticeCode;

import java.util.Random;

public class TestingRandom {
    public static void main(String[] args) {
        Random generator = new Random();

        int diceRoll = generator.nextInt(20);
        diceRoll = diceRoll + 1; //because 20 is not inclusive

        System.out.println(diceRoll);
    }
}
