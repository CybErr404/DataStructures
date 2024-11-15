package Implementations.DataStructures.Stack;

public class TestMiaDeck {
    public static void main(String[] args) {
        MiaDeck myDeck = new MiaDeck();
        System.out.println("Adding 1, 2, and 3: ");
        myDeck.push(1);
        myDeck.push(2);
        myDeck.push(3);
        System.out.println(myDeck);
        System.out.println("\nRemoving number on top of the deck: ");
        myDeck.pop();
        System.out.println(myDeck);
        System.out.println("\nChecking the element on the top of the deck: ");
        System.out.println(myDeck.peek());
        System.out.println("\nIs the deck empty?\n" + myDeck.empty());
        System.out.println("\nPosition where 2 is in the deck: \n" + myDeck.search(2));
        System.out.println("Printing the deck (to compare where 2 actually is):\n" + myDeck);
    }
}
