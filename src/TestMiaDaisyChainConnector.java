//DONE BEFORE ANYTHING ELSE:
//Write a tester.
//Call add method for 6 elements.
//Print out results.
public class TestMiaDaisyChainConnector {
    public static void main(String[] args) {
        MiaDaisyChainConnector daisyChain = new MiaDaisyChainConnector();
        for(int i = 1; i <= 6; i++) {
            daisyChain.addFront(i);
        }
        System.out.println(daisyChain);
        System.out.println(daisyChain.size());
        daisyChain.replace(2, 100);
        System.out.println(daisyChain);
        daisyChain.addEnd(19);
        System.out.println(daisyChain);
        daisyChain.addAtIndex(3, 1000);
        System.out.println(daisyChain);
        //System.out.println(daisyChain.contains(19));
        //System.out.println(daisyChain.contains(20));
        daisyChain.removeFront();
        System.out.println(daisyChain);
        daisyChain.removeEnd();
        System.out.println(daisyChain);
        daisyChain.removeAtIndex(1);
        System.out.println(daisyChain);
        daisyChain.clear();
        System.out.println(daisyChain);
    }
}
