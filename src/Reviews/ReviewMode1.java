package Reviews;//HOMEWORK - FINISH THE POKÉMON PROGRAM. WITH 4 POKÉMON, 4 DIFFERENT ATTACKS, AND LOOP
//THEM ATTACKING EACH OTHER UNTIL ONE OF THEM HAS 0 OR LESS HP.
//add any missing stats, getters, and setters.
//each Pokemon has 4 attacks. look them up and do your best to interpret them!
//have your pokemon battle in a loop using an arbitrary attack until one of them wins.
//print out the winner.
//ADD A GLOBAL VARIABLE "NAME" to your Pokemon. come to class with this program complete on Monday.

public class ReviewMode1 { //covered so far:
    /**
     * constructors - job is to initialize global variables which should be private.
     * we covered the differences in scope to a small degree (public, private, and protected).
     * methods - getter and setter methods. getters return something (a specific type).
     * setters are void. they set something to something else.
     */

    //this statement does NOT get deleted until the END OF THE PROGRAM.
    private String liveLong = "Long Live the String";

    //NEVER write
    public void dumbMethod() {
        boolean dog = false;
        //if(dog == false) {
        //}

        //INSTEAD write
        //if(dog) {
        //}
        //or
        //if(!dog) {
        //}
    }

    //GETTER method.
    public double getMoney() {
        return 10;
    }
    //SETTER method with an oldMoney variable.
    double oldMoney;
    public void setMoney(double newMoney) {
        oldMoney = newMoney;
        oldMoney++;
        //you can use a blank return statement in a setter method. it still works!
        //you can use this to stop a for loop if you know whatever you have is what you wanted.
        return;
    }

    //also covered GLOBAL VARIABLES.
    //MAKE THEM PRIVATE. DO NOT ASSIGN VALUES. the constructor assigns! NOT the variable.

    //FLOW CONTROL.
    //if, else if, and else.
    //the else statement should say "in all other cases" in your mind.

    //LOOPS.
    //while, for each, do while, and for loops.
    //for loops and while loops can functionally be exactly the same.
        //for loops - when you know the ending point.
        //while loops - when you know it ends, but don't know when.
        //do while loops - DON'T. JUST DON'T USE THEM, EVER.
        //for each loops - when you want to traverse, but not change, values.

    double[] monkies;
    public void setMonkey() {
        //singleMonkey is a LOCAL VARIABLE. a copy is made and is stored into the local variable.
        //singleMonkey disappears after the loop ends.
        for(double singleMonkey : monkies) {
            System.out.println(singleMonkey);
            //DOES NOT WORK --> singleMonkey = 0;
            //what would that do? BAD. for each loops traverse, but don't change, variables.
        }

        for(int i = 0; i < monkies.length; i++) {
            monkies[i] = 0;
        }
    }

    //SCOPE.
    //where a variable or method lives.

    //ARRAYS.
    //any time you dump [] next to a type, you get an array.
    //cat[] int[] double[] are all examples.
    //BUT... you have to fill it out to have it have meaning.
        //so, code might look like this:
        //Cat[] myCats = new Cat[10];
            //all of these cats are NULL. you have to manually construct them...
            //using a loop.
        //Note 1: when using arrays, you will be using loops.
        //it is usually insane to do arrays without loops.
            //this is because loops are unknown in size and content in most of the real world. (most cases).
        //Note 2: arrays are a pain in the butt. they have a limit to their size which is unchangeable.
        //Note 3: if you want more cats, copy old cats into bigger cat array.

    //ARRAYLISTS.
    //they are the better way to deal with arrays...
    //FINE PRINT = sometimes they are the slower way to deal with arrays.
    //your code will always be slower than code with a base array, so it depends on when you should use this.
        //to use ArrayLists, you have to import them.
        //import java.util.ArrayList;
        //dots represent folders. is found in java folder, which has a util folder, which contains ArrayLists.
    //you have to write the following:
    //ArrayList<Integer> things = new ArrayList<>();
    //you can't write <int>, because you're accessing a generic which can't be a primitive type.
        //primitive types
            //int, double, boolean, char.
        //!primitive types
            //String (capital letter, so it is a CLASS.)
    //there are class variants of primitive types.
        //Double and double
        //Integer and int
        //possibly Character and char.
    //JAVA does the conversions from one to the other for you. at a price... you pay in TIME.

    //GLOBAL VARIABLES ARE ALSO CALLED FIELDS.

    //HOW DO WE USE ARRAYLISTS?
    //use the java API!

    //IMPORTANT INFORMATION
    //System.out.println("Hello World");
        //System is a class.
        //out is a global variable (we don't know what typing out is). it is also a class.
        //println("Hello World"); is a method call. println is a method.

    //EXTENDS.
    //allows for inheritance.
    //what is inheritance?

    //INHERITANCE.
    //where you share the public interface of your super class.
    //the public interface contains everything that is PUBLIC.
    //this allows for a subclass and super class relationship.
}
