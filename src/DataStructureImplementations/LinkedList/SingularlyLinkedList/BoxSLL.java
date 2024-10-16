package DataStructureImplementations.LinkedList.SingularlyLinkedList;

public class BoxSLL {
    private BoxSLL next;
    private int data;

    public BoxSLL(BoxSLL inputNext, int inputData) {
        next = inputNext;
        data = inputData;
    }

    public void setNext(BoxSLL newNext) {
        next = newNext;
    }
    public BoxSLL getNext() {
        return next;
    }
    public void setData(int newData) {
        data = newData;
    }
    public int getData() {
        return data;
    }
}
