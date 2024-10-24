package IteratorImplementations.AdvancedSlotMachine;

import java.util.ArrayList;
import java.util.Random;
public class AdvancedSlotMachine implements AdvancedIterator {
    private ArrayList<Coin> coins;
    private Coin coin;
    public AdvancedSlotMachine() {
        coins = new ArrayList<>();
        coin = new Coin();
    }

    public void addMoney() {
        for(int i = 0; i < 20; i++) {
            coins.add(coin);
        }
    }

    @Override
    public boolean hasNext() {
        if(coins.size() > 0) {
            return true;
        }
        return false;
        //return coins.isEmpty();
    }

    @Override
    public int next() {
        remove();
        return 1;
    }

    @Override
    public void remove() {
        coins.remove(0);
    }

    public void pullSlotMachine() {
        int count = 0;
        int losses = 0;
        int wins = 0;
        System.out.println("Welcome to the Slot Machine! " + coins.size());
        while(hasNext()) {
            Random randomNumber = new Random();
            int value = randomNumber.nextInt(100);
            value += 1; //since 100 is NOT inclusive.
            if(value > 20) {
                next();
                losses += 1;
            }
            else {
                coins.add(coin);
                coins.add(coin);
                wins += 1;
            }
            count++;
        }
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Number of times slot machine was played before bankruptcy: " + count);
    }

    public void run() {
        addMoney();
        pullSlotMachine();
    }
}
