package LinkedListImplementation;

//REPRESENTS THE INTRODUCTORY SINGULARLY LINKED LIST DATA STRUCTURE.
//contains(element)
public class MiaDaisyChainConnector {
    private Box head;
    private int size;

    public MiaDaisyChainConnector() {
        head = null;
        size = 0;
    }

    public void addFront(int newData) {
        if(head == null) {
            head = new Box(null, newData);
        }
        else {
            Box temp = head;
            head = new Box(temp, newData);
        }
        size++;
    }

    public void addEnd(int newData) {
        Box newBox = new Box(null, newData);
        Box temp = get(size - 1);
        temp.setNext(newBox);
    }

    public void addAtIndex(int position, int newData) {
        Box currentBox = get(position);
        Box temp1 = get(position - 1);
        Box temp2 = currentBox.getNext();
        Box newBox = new Box(null, newData);
        temp1.setNext(newBox);
        newBox.setNext(currentBox);
        currentBox.setNext(temp2);
    }

    public void removeFront() {
        head = head.getNext();
        size--;
    }

    public void removeEnd() {
        Box temp = get(size);
        temp.setNext(null);
        size--;
    }

    public void removeAtIndex(int position) {
        Box currentBox = get(position);
        Box temp1 = get(position - 1);
        Box temp2 = currentBox.getNext();
        temp1.setNext(temp2);
        currentBox.setNext(null);
        size--;
    }

    public void replace(int position, int newData) {
        Box newBox = get(position);
        newBox.setData(newData);
    }

    public void clear() {
        head = null;
    }

    public Box get(int position) {
        Box newBox = head;
        for(int i = 0; i < position && newBox != null; i++) {
            newBox = newBox.getNext();
        }
        return newBox;
    }

    public boolean contains(int data) {
        Box newBox = head;
        for(int i = 0; i < size - 1 && newBox != null; i++) {
            newBox = newBox.getNext();
            if(newBox.getData() == data) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        Box headBox = head;
        if(headBox != null) {
            while(headBox.getNext() != null) {
                string.append(headBox.getData());
                string.append(", ");
                headBox = headBox.getNext();
            }
            string.append(headBox.getData());
        }
        return string.toString();
    }
}
