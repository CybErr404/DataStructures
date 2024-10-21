package PracticeCode.SingletonDesign;

public class TestChocolateFactory {
    public static void main(String[] args) {
        //DOES NOT WORK.
        //ChocolateFactory test = new ChocolateFactory();

        //DOES WORK!
        System.out.println(ChocolateFactory.instanceOf.getFlavor());
        System.out.println(ChocolateFactory.getInstance().getFlavor());
    }
}
