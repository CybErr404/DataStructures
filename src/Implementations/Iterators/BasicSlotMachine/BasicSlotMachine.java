package Implementations.Iterators.BasicSlotMachine;

import java.util.Random;

public class BasicSlotMachine implements BasicIterator {

    private int coins;

    public BasicSlotMachine() {
        coins = 20;
    }

    @Override
    public boolean hasNext() {
        return coins > 0;
    }

    @Override
    public int next() {
        remove();
        return 1;
    }

    @Override
    public void remove() {
        coins--;
    }

    public void pullSlotMachine() {
        int count = 0;
        int losses = 0;
        int wins = 0;
        System.out.println("Welcome to the Slot Machine!");
        while(hasNext()) {
            Random randomNumber = new Random();
            int value = randomNumber.nextInt(100);
            value += 1; //since 100 is NOT inclusive.
            if(value >= 20) {
                next();
                losses += 1;
            }
            else {
                coins += 2;
                wins += 1;
            }
            count++;
        }
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Number of times slot machine was played before bankruptcy: " + count);
    }

    public void run() {
        pullSlotMachine();
    }
}
