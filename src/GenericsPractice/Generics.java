package GenericsPractice;

public class Generics {
    //Code re-usage - inheritance and polymorphism.
    //Ever wonder how ArrayList<> has those alligator braces with a parameter?
        //It's not some hard coded element, which means we can program this ourselves.

    //Polymorphism - gives you the ability to write a class with a polymorphic type.

    //Generics allows your program to accept user-defined typing.

    //Why use generics?
    //Just like polymorphism, we can cut down on code re-use.
    //Imagine writing an ArrayList class for every data type...

    //Technically, it does catch bugs before you ru if you have a type mismatch.
    //Better to break before than during program.

    //Don't need to cast (as much)!

    //Can tap into algorithms specific to generics.

    //Easier to read and write.

    //When thinking about what rules generics adhere to, think back to exposure to generic programming.
    //The Arraylist<>.

    //Remember in ArrayList we can only use class references, no primitives.
    //We can't do ArrayList<int> because it is a primitive with no references.

    //Weird trivia, yoy can put something like <double[]> because there's a reference and generics are okay with that.

    //The catch with using generics -
    //It is more complex programming.
    //Understanding things like (? extends, ? super) can be difficult. Those are wild card statements.
    //Has a performance cost, as you're doing a lot of conversions to Object during runtime.
    //No support for primitive types.
    //Can't unleash full power of reflection.

    //Can add <> next to the class name to give a parameter to the class.
    //T - type, E - element, K - key, N - number, and V - value (make a global variable of type parameter).

    //Can in theory use multiple parameters.
    //ClassName<T, U>

    //Could make a printer method.
    //public void print()
        //System.out.println(thing1 + " " + thing2);

    //To test:
    //Test<String, Integer> test1 = new Test<String, Integer>("Example 2", 100);
    //test1.print();

    //Helpful to make converter methods. AS A WHOLE.
    //otice your can turn your methods into generic methods:
    //public <T> void genericDisplay(T element) {
        //System.out.println(element.getClass().getName() + "=" + element);
    //}

    //HOMEWORK - What now?
    //Clone a copy of MiaContainer.
    //Make a new project in your repository.
    //Modify your ArrayList class to accept Generics.
    //Hint - Step 1: Add <T> to your ArrayList class somewhere.

    //MORE GENERICS NOTES
    //private T[] someData;
    //private int size;

    //public MyListArray() {
        //someData = (T[]) new Object[10];
        //size = 0;
    //}

    //TRUE ARRAYLIST IMPLEMENTATION
    //public lass ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable
}
