package LinkedListImplementation;

public class TestMiaDaisyChainConnector {
    public static void main(String[] args) {
        MiaDaisyChainConnector daisyChain = new MiaDaisyChainConnector();
        for(int i = 1; i <= 6; i++) {
            daisyChain.addFront(i);
        }
        System.out.println("Daisy chain after adding 1-6: " + daisyChain);
        System.out.println("Current size: " + daisyChain.size());
        daisyChain.replace(2, 100);
        System.out.println("Daisy chain after replacing 2 with 100: " + daisyChain);
        daisyChain.addEnd(19);
        System.out.println("Daisy chain after adding 19 to the end: " + daisyChain);
        daisyChain.addAtIndex(3, 1000);
        System.out.println("Daisy chain after adding 1000 in position 3: " + daisyChain);
        System.out.println("Chain contains 3: " + daisyChain.contains(3));
        System.out.println("Chain contains 20: " + daisyChain.contains(20));
        daisyChain.removeFront();
        System.out.println("Daisy chain after removing the element at the beginning: " + daisyChain);
        daisyChain.removeEnd();
        System.out.println("Daisy chain after removing the element at the end: " + daisyChain);
        daisyChain.removeAtIndex(1);
        System.out.println("Daisy chain after removing the item in position 1: " + daisyChain);
        daisyChain.clear();
        System.out.println("Cleared daisy chain: " + daisyChain);
    }
}
