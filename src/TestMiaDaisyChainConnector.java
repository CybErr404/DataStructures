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
    }
}
