package MiaContainerArrayListImplementation;

import java.util.Arrays;
import java.util.Objects;

public class MiaContainer {
    //Write a method that adds a value to your container.
    //find the first empty spot in your array and put it there.
        //Normally, you initialize an array to be a specific size.
        //At 10 and 11 elements, you won't be able to add anything else to the array.
        //Make sure that when you add an element that the array doesn't exceed the container size.
        //If it is too much, take your container size, multiply by 2, and make a new empty array
            //with the new size.
        //Then, using a for loop, copy all values from old array to the new array.

    //Write a method that removes a value at a position of that array.
    //That means all the values after the position have to be moved up one spot

    //Write a method that clears the container.

    //Write a method that returns the size of the container. SIZE MEANS NUMBER OF ADDED VALUES.
        //NOT THE TOTAL SIZE OF THE ARRAY.

    //Write a get(x) (a getter) to return an element at a specific position.

    //write a toString to print something interesting.
    //we will be yelled at if the toString has a println in it... DON'T DO IT.

    //Write a tester. loop a bunch of values into the container.
    //test each method with clear english text representing the results.

    //More add methods
    //Write an overloaded add(position, value) method
    //In the int position, position, add the new value, and shift all other values forward
        //(opposite of remove)

    //Write replace(position, newValue)
    //It will replace the value at position with newValue.

    //Write a new method, addFirst(value)
    //This will add an element to the beginning of the array and will shift everything up.

    //Write a method (methods) that removes first AND removes last elements.

    //Ask your program if it contains a value, returning true or false if it does or doesn't.
    //Ask your program for the index of a given value (indexOf(value)).
    //Write a method called isEmpty(). Returns list if it has no elements in it.

    //BROWNIE POINTS:
    //Write an add all method.

    private String[] data;
    private int currentPosition;
    public MiaContainer() {
        data = new String[10];
        currentPosition = 0;
    }

    public void addData(String newData) {
        if(currentPosition == data.length) {
            String[] biggerData = new String[data.length * 2];
            for(int i = 0; i < data.length; i++) {
                biggerData[i] = data[i];
            }
            //make a new array
            //loop old array, copy value to new array
            //assign data to the new array.
            biggerData[currentPosition] = newData;
            currentPosition++;
        }
//        data[currentPosition] = newData;
//        currentPosition++;
    }

    public void addData(int position, String newData) {

    }

    public void addFirst() {

    }

    public void replace(int position, String newData) {

    }

    public void remove(int positionToRemove) {
        for(int i = 0; i < data.length; i++) {
            if(i == positionToRemove && !(data[i].equals(""))) {
                data[positionToRemove] = "";
            }
        }
    }

    public void removeFirst() {

    }

    public String[] clearContainer() {
        String[] clearedContainer = new String[]{};
        return clearedContainer;
    }

    public int checkSize() {
        return currentPosition;
    }

    public String getElement(int position) {
        return data[position];
    }

    public boolean contains(String userData) {
        for(int i = 0; i < data.length; i++) {
            if(data[i].equals(userData)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(String userData) {
        for(int i = 0; i < data.length; i++) {
            if(data[i].equals(userData)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return currentPosition == 0;
    }

    @Override
    public String toString() {
        return "";
    }
}
