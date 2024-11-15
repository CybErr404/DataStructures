package Implementations.DataStructures.LinkedList.CircularlyLinkedList;

public class TestMiaDaisyChainConnectorCLL {
    public static void main(String[] args) {
        MiaDaisyChainConnectorCLL daisyChain = new MiaDaisyChainConnectorCLL();

        for(int i = 1; i <= 6; i++) {
            daisyChain.addFront(i);
        }

        System.out.println("Daisy chain after adding numbers 1-6 to the front: \n" + daisyChain);
        System.out.println("Current size: " + daisyChain.size() + "\n");

        daisyChain.replace(2, 100);
        System.out.println("Daisy chain after replacing the number 2 with 100: \n" + daisyChain);
        System.out.println("Current size: " + daisyChain.size() + "\n");

        daisyChain.addEnd(19);
        System.out.println("Daisy chain after adding 19 to the end: \n" + daisyChain);
        System.out.println("Current size: " + daisyChain.size() + "\n");

        daisyChain.addAtIndex(3, 1000);
        System.out.println("Daisy chain after adding 1000 in position 3: \n" + daisyChain);
        System.out.println("Current size: " + daisyChain.size() + "\n");

        daisyChain.addAtIndex(0, 25);
        System.out.println("Daisy chain after adding 25 in position 0: \n" + daisyChain);
        System.out.println("Current size: " + daisyChain.size() + "\n");

        daisyChain.addAtIndex(9, 72);
        System.out.println("Daisy chain after adding 72 in position 9: \n" + daisyChain);
        System.out.println("Current size: " + daisyChain.size() + "\n");

        System.out.println("Daisy chain contains 3: \n" + daisyChain.contains(3));
        System.out.println("Daisy chain contains 20: \n" + daisyChain.contains(20) + "\n");

        daisyChain.removeFront();
        System.out.println("Daisy chain after removing the element at the beginning: \n" + daisyChain);
        System.out.println("Current size: " + daisyChain.size() + "\n");

        daisyChain.removeEnd();
        System.out.println("Daisy chain after removing the element at the end: \n" + daisyChain);
        System.out.println("Current size: " + daisyChain.size() + "\n");

        daisyChain.removeAtIndex(1);
        System.out.println("Daisy chain after removing the item in position 1: \n" + daisyChain);
        System.out.println("Current size: " + daisyChain.size() + "\n");

        System.out.println("Head: " + daisyChain.getHead().getData());
        System.out.println("Tail: " + daisyChain.getTail().getData() + "\n");

        daisyChain.clear();
        System.out.println("Cleared daisy chain: \n" + daisyChain);
        System.out.println("Current size: " + daisyChain.size() + "\n");
    }
}
