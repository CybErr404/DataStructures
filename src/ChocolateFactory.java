//SINGLETON DESIGN LECTURE.
//ONLY ONE OBJECT CAN EVER BE CREATED FROM THIS CLASS.
//LOCKS DOWN YOUR PROGRAM.
public class ChocolateFactory {
    //Tell me what's in the variable via a main method.
    private String flavor = "Strawberry";
    public static ChocolateFactory instanceOf = new ChocolateFactory();

    private ChocolateFactory() {

    }

    public static ChocolateFactory getInstance() {
        if(instanceOf == null) {
            instanceOf = new ChocolateFactory();
        }
        return instanceOf;
    }

    public String getFlavor() {
        return flavor;
    }
}
