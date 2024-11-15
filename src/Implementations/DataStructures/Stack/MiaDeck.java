package Implementations.DataStructures.Stack;

//REPRESENTS A STACK DATA STRUCTURE.
public class MiaDeck {
    private int[] deck;
    private int currentPosition;

    public MiaDeck() {
        deck = new int[10];
        currentPosition = 0;
    }

    public boolean empty() {
        return currentPosition == 0;
    }

    public void increaseSize() {
        if(currentPosition == deck.length) {
            int[] temp = new int[deck.length * 2];
            for(int i = 0; i < deck.length; i++) {
                temp[i] = deck[i];
            }
            deck = temp;
        }
    }

    public int peek() {
        return deck[currentPosition - 1];
    }

    public void push(int newData) {
        if(currentPosition > deck.length) {
            increaseSize();
        }
        deck[currentPosition] = newData;
        currentPosition++;
    }

    public int pop() {
        int temp = deck[currentPosition];
        currentPosition--;
        return temp;
    }

    public int search(int data) {
        for(int i = 0; i < deck.length; i++) {
            if(deck[i] == data) {
                return i - 1;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = currentPosition - 1; i >= 0; i--) {
            result = result + deck[i] + " ";
        }
        return result;
    }
}
