package PracticeCode.GenericsPractice;

public class MiaUniversalBox <T> {
    //global variable, should consider making it private.
    public T thing1;

    public MiaUniversalBox(T userInputThing) {
        thing1 = userInputThing;
    }

    public T getThing1() {
        return thing1;
    }
}
