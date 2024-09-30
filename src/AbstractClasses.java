public abstract class AbstractClasses {
    //Abstract classes are classes that cannot have a constructor.
    //You CAN'T use the keyword new on them.

    //public abstract class Pokemon

    //Abstract classes can have global variables.
    //They can also have filled methods.
    //They can also have abstract methods.
    //Abstract classes use keyword extends.

    //global variable.
    String name = "";

    //abstract method.
    public abstract void fight();

    //filled method.
    public String getName() {
        return name;
    }

    //YOU CAN DO THIS!
    //Pokemon pk = new Pikachu();
}
