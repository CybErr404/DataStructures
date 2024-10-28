package DataStructureImplementations.Queue;

import java.util.LinkedList;
public class MiaLine {
    //Base data structure will be a LinkedList this time.
    //Not data arrays (int[])!
    //A line can:
        //add() someone to the back of the line. This means add someone to line, and throw an
        //exception if the line is full.
        //poll() someone at front of line, and this removes and returns the person.
        //You can remove someone from the front of the line.
        //You can also offer a person. This means add someone to the line, and if it
        //is full, make it work!

    //Additional:
    //Remake the program to be built on a regular array, like int[] data.

    private LinkedList<Integer> data;

    public MiaLine() {
        data = new LinkedList<>();
    }

    public void add(int newData) {
        data.add(newData);
    }

    public int poll() {
        return data.get(0);
    }

    public void remove() {
        data.remove();
    }

//    public boolean offer(int newData) {
//        data.add(newData);
//    }

    @Override
    public String toString() {
        String result = "";
        int i = 0;
        while(data.peek() != null && i != data.size()) {
            result = result + data.get(i) + " ";
            i++;
        }
        return result;
    }
}
