package Reviews;

//9/18/24
public class ReviewMode2 {
    //APIs - Application Program Interface
    //What is an API?
        //The dictionary of Java.

    //SUBCLASS AND SUPERCLASS RELATIONSHIPS
    //Also called inheritance.

    //INTERFACES
    //What is an interface?
        //A blueprint of a class. Contains abstract methods that must be used in classes
        //that implement the interface.
            //public interface Actionable
        //Holds methods (abstract)

    //ABSTRACT METHODS
    //Unfilled methods, or empty methods.

    //RULES OF INTERFACES
    //No constructors.
    //No global variables.
        //There is a way to force global variables into interfaces. DON'T.
    //No private identifiers.
    //No filled methods.

    //COMPARING VALUES
    //==, equals, instanceof, and comparing doubles.

    //STATIC
    //Everyone shares the variable or method.
    //When do you use static?
    //NEVER.
        //Cases to use it:
        //Main method forces you to.
        //Whenever a variable is constant (never changes).
        //If your method doesn't touch a global variable.

    //UMLs
    //Unified Modeling Language (boxes with arrows that describe the connections of inheritance).
        //Dependency things, has a relationships, the interface, etc.

    //POLYMORPHISM
    //How would you program polymorphism?
    //What is it: When you have a method that accepts a parameter that can be "anything."
        //i.e., passing 16 different Pokemon to one method that accepts a Pokemon.
    //What the purpose is: You don't have to write a million lines of code using this!
    //Reduces code so you don't have to write a million methods to do a similar interaction
    //across classes or interfaces.

    //OVERLOADING - We didn't cover this. )_)
    //Same method name, different parameter.
    //If you can help it, don't overload methods. Use polymorphism.

    //OVERRIDES
    //Have a superclass relationship where you want the superclass method to do something different,
    //so you program your own version of it.
        //i.e., overriding toString methods to have it print what you want.
    //We want to remember to use the @Override notation: why?
        //Ensures the method you wrote actually overrides something instead of creating a new method via typo.
    //Method overriding things -
    //Using the prefix super in a call to a method methodName calls the method with that
    //name in the superclass of the current class.


    //OBJECT SUPERCLASS
    //This is the highest superclass. The root of it all. The class of all classes.
        //OBJECT.
    //Any class can use object class methods.
        //toString
        //equals

    //HOW MANY TIMES CAN YOU EXTEND?
    //Once.

    //HOW MANY TIMES CAN YOU IMPLEMENT?
    //As many times as you want.

    ///ONE METHOD, ONE RESPONSIBILITY
    //If the method you see has multiple responsibilities, you should rewrite the method into
    //two separate methods (or however many methods it takes) so each only has one job.
}
