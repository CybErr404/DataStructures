package DataStructureImplementations.LinkedList.DoublyLinkedList;

public class BoxDLL {
    private BoxDLL next;
    private BoxDLL previous;
    private int data;

    public BoxDLL(BoxDLL inputNext, BoxDLL inputPrevious, int inputData) {
        next = inputNext;
        previous = inputPrevious;
        data = inputData;
    }

    public void setNext(BoxDLL newNext) {
        next = newNext;
    }
    public BoxDLL getNext() {
        return next;
    }
    public void setPrevious(BoxDLL newPrevious) { previous = newPrevious; }
    public BoxDLL getPrevious() { return previous; }
    public void setData(int newData) {
        data = newData;
    }
    public int getData() {
        return data;
    }
}
