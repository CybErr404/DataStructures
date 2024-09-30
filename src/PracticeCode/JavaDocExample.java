package PracticeCode;

/**
 * This class has the purpose of teaching the real life classroom how to write javadocs.
 * Expectations for homework -
 * Make Pokemon class abstract. Add an abstract method that each Pokemon must override.
 * Consider what makes sense.
 * Learn how to generate Javadocs from this IDE.
 * Write your own exception and handle it. Add this work to your ArrayList or Pokemon projects
 * (or both).
 *
 * @author Mia
 */
public class JavaDocExample {
    private int x;

    /**
     * This is the variable y.
     */
    public int y;

    public void fight() {
        System.out.println("FIGHTING");
        int[] test = new int[10];

        //We can try to do something that might break.
        try {
            //Such as... adding to a value outside the bounds of your array.
            test[11] = 15;
        } catch(Exception e) {
            //e.printStackTrace();
            //The above statement shows EXACTLY where your error is. Can be dangerous.

            //test[10] = 15; //DO NOT FIX YOUR CODE LIKE THIS.
            //DO NOT FIX THIS BY KEEPING THIS EMPTY, EITHER.
            throw e;
        }

        //The only time you use a try catch is if you can guarantee the program will
        //run CORRECTLY to completion with your new fix.
            //Otherwise, just throw the exception and handle it from development side.
    }

    public void thunderbolt() throws ThunderboltException{ //have to add throws here.
        //WHAT IF THUNDERBOLT GOES WRONG?
        if(true) {
            //do move
        }
        else {
            throw new ThunderboltException();
        }
    }
}
