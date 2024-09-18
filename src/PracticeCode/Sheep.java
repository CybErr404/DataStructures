package PracticeCode;

import java.util.ArrayList;

//class named sheep
public class Sheep {
    //two attributes of a sheep
    private String color = "White";
    //private - this variable can ONLY BE USED IN THIS CLASS.
    //protected - everything inside the folder can use whatever is protected.

    /**
     * two ways to write protected:
     * protected String color = "White";
     * String color = "White";
     * you do not need to declare anything at the beginning for it to be protected!
     */

    //double = very big numbers.
    //int = smaller numbers.
    private double hair = 100;

    //new variable for storing to an ArrayList.
    private ArrayList<String> listOfColor;

    //write a constructor
    //constructors initialize all global variables.
    public Sheep() { //empty constructor
        color = "White";
        hair = 100;
        listOfColor = new ArrayList<>();
    }
    public Sheep(String userInputColor, double userInputHair) { //filled constructor
        color = userInputColor;
        hair = userInputHair;
    }

    //getter and setter methods
    //getters are always of type whatever is being gotten.
    //setters are always of type VOID.
    public String getColor() {
        return color;
    }
    public void setColor(String newColor) {
        color = newColor;
    }

    //new method to check whether variable is 0 or null
    public boolean checkVariable() {
        if(color == null) {
            return false; //meaning nothing was assigned.
        } else {
            return true;
        }
        //can be simplified to --> return color != null;
    }

    //create a method that inspects the variable, changing the value if the item is actually false.
    public void inspectVariable() {
        for(int i = 0; i < 10; i++) {
            //can also be written as !checkVariable()
            if(checkVariable() == false) {
                setColor("Black");
                listOfColor.add("Black");
            }
        }
    }
}
