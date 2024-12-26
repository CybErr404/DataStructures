package QuickDrills.MiddleDeleter;

public class TestMiddleDeleter {
    public static void main(String[] args) {
        MiddleDeleter deleter = new MiddleDeleter();
        System.out.println(deleter.deleteMiddleCharacter("delete"));
        System.out.println(deleter.deleteMiddleCharacter("wow"));
        System.out.println(deleter.deleteMiddleCharacter("hello"));
    }
}
