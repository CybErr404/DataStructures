package DataStructureImplementations.LinkedList.DoublyLinkedList;

public class MiaDaisyChainConnectorDLL {
    private BoxDLL head;
    private int size;

    public MiaDaisyChainConnectorDLL() {
        head = null;
        size = 0;
    }

    public void addFront(int newData) {
        if(head == null) {
            head = new BoxDLL(null, null, newData);
        }
        else {
            BoxDLL temp = head;
            head = new BoxDLL(temp, null, newData);
            temp.setPrevious(head);
        }
        size++;
    }

    public void addEnd(int newData) {
        BoxDLL newBox = new BoxDLL(null, null, newData);
        BoxDLL temp = get(size - 1);
        temp.setNext(newBox);
        newBox.setPrevious(temp);
        size++;
    }

    public void addAtIndex(int position, int newData) {
        BoxDLL currentBox = get(position);
        BoxDLL temp1 = currentBox.getPrevious();
        BoxDLL temp2 = currentBox.getNext();
        BoxDLL newBox = new BoxDLL(null, null, newData);
        temp1.setNext(newBox);
        newBox.setNext(currentBox);
        newBox.setPrevious(temp1);
        currentBox.setNext(temp2);
        currentBox.setPrevious(newBox);
        size++;
    }

    public void removeFront() {
        head = head.getNext();
        size--;
    }

    public void removeEnd() {
        BoxDLL temp1 = get(size - 1);
        BoxDLL temp2 = temp1.getPrevious();
        temp2.setNext(null);
        temp1.setNext(null);
        temp1.setPrevious(null);
        size--;
    }

    public void removeAtIndex(int position) {
        BoxDLL currentBox = get(position);
        BoxDLL temp1 = currentBox.getPrevious();
        BoxDLL temp2 = currentBox.getNext();
        temp1.setNext(temp2);
        temp2.setPrevious(temp1);
        currentBox.setNext(null);
        size--;
    }

    public void replace(int position, int newData) {
        BoxDLL newBox = get(position);
        newBox.setData(newData);
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public BoxDLL get(int position) {
        BoxDLL newBox = head;
        for(int i = 0; i < position && newBox != null; i++) {
            newBox = newBox.getNext();
        }
        return newBox;
    }

    public boolean contains(int data) {
        BoxDLL newBox = head;
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
        BoxDLL headBox = head;
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
