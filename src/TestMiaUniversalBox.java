public class TestMiaUniversalBox {
    public static void main(String[] args) {
        //we can modify the constructor to accept a parameter here.
        MiaUniversalBox<Integer> test1 = new MiaUniversalBox<>(777);
        //the empty braces on other half indicates diamond interface.
        //no interface going on, it's just called that.
        MiaUniversalBox<String> test2 = new MiaUniversalBox<>("Hello World");

        System.out.println(test1.getThing1());
        System.out.println(test2.getThing1());
    }
}
