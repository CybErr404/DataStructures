package IteratorImplementations.BasicSlotMachine;

public interface BasicSlotMachineIterator {
    //Write your own Iterator program interface.
        //It has next, hasNext, and remove.
            //Skip the other method in the API.

    //Write a program called Slot Machine.
        //Slot Machine has a global variable that's an int called coins.
        //Slot Machine also implements the Iterator interface.

    //Iterate through your coins. Each win gives you 2 coins.
        //Each loss eats a coin.
        //Make the odds of winning 20% and the odds of losing 80%.
        //Run the slot machine until you are broke.
            //Count how many times you got to play until you were out of money.

    //If done early, make a new program that is exactly the same, except coins are coin type objects.
        //Reminder - this means 2 programs TOTAL if this is done.
        //Have an ArrayList of coins.
        //Modify the program to accept the ArrayList of coins.

    boolean hasNext();
    int next();
    void remove();
}
