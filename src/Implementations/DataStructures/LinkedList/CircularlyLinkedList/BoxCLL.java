package Implementations.DataStructures.LinkedList.CircularlyLinkedList;

public class BoxCLL {
    private BoxCLL next;
    private BoxCLL previous;
    private int data;

    public BoxCLL(BoxCLL inputNext, BoxCLL inputPrevious, int inputData) {
        next = inputNext;
        previous = inputPrevious;
        data = inputData;
    }

    public void setNext(BoxCLL newNext) {
        next = newNext;
    }
    public BoxCLL getNext() {
        return next;
    }
    public void setPrevious(BoxCLL newPrevious) { previous = newPrevious; }
    public BoxCLL getPrevious() { return previous; }
    public void setData(int newData) {
        data = newData;
    }
    public int getData() {
        return data;
    }
}
