//box class. boxes hold data.
//it has a String, int, etc. (whatever you like).
//it also has a global variable next. next is a box.
public class Box {
    private Box next;
    private int data;

    public Box(Box inputNext, int inputData) {
        next = inputNext;
        data = inputData;
    }

    public void setNext(Box newNext) {
        next = newNext;
    }
    public Box getNext() {
        return next;
    }
    public void setData(int newData) {
        data = newData;
    }
    public int getData() {
        return data;
    }
}
