package LinkedListImplementations.CircularlyLinkedList;

public class MiaDaisyChainConnectorCLL {
    private BoxCLL head;
    private BoxCLL tail;
    private int size;

    public MiaDaisyChainConnectorCLL() {
        head = null;
        tail = null;
        size = 0;
    }

    public void addFront(int newData) {
        if(head == null) {
            head = new BoxCLL(null, null, newData);
        }
        else {
            BoxCLL temp = head;
            head = new BoxCLL(temp, null, newData);
            temp.setPrevious(head);
            tail = get(size);
        }
        size++;
    }

    public void addEnd(int newData) {
        BoxCLL newBox = new BoxCLL(null, null, newData);
        BoxCLL temp = tail;
        temp.setNext(newBox);
        newBox.setPrevious(temp);
        tail = newBox;
        size++;
    }

    public void addAtIndex(int position, int newData) {
        if(position == 0) {
            addFront(newData);
        }
        else if(position == size) {
            addEnd(newData);
        }
        else {
            BoxCLL currentBox = get(position);
            BoxCLL temp1 = currentBox.getPrevious();
            BoxCLL temp2 = currentBox.getNext();
            BoxCLL newBox = new BoxCLL(null, null, newData);
            temp1.setNext(newBox);
            newBox.setNext(currentBox);
            newBox.setPrevious(temp1);
            currentBox.setNext(temp2);
            currentBox.setPrevious(newBox);
            size++;
        }
    }

    public void removeFront() {
        head = head.getNext();
        size--;
    }

    public void removeEnd() {
        BoxCLL temp1 = get(size - 1);
        BoxCLL temp2 = temp1.getPrevious();
        temp2.setNext(null);
        temp1.setNext(null);
        temp1.setPrevious(null);
        tail = temp2;
        size--;
    }

    public void removeAtIndex(int position) {
        if(position == 0) {
            removeFront();
        }
        else if(position == size) {
            removeEnd();
        }
        else {
            BoxCLL currentBox = get(position);
            BoxCLL temp1 = currentBox.getPrevious();
            BoxCLL temp2 = currentBox.getNext();
            temp1.setNext(temp2);
            temp2.setPrevious(temp1);
            currentBox.setNext(null);
            size--;
        }
    }

    public void replace(int position, int newData) {
        BoxCLL newBox = get(position);
        newBox.setData(newData);
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    public BoxCLL get(int position) {
        BoxCLL newBox = head;
        for(int i = 0; i < position && newBox != null; i++) {
            newBox = newBox.getNext();
        }
        return newBox;
    }

    public boolean contains(int data) {
        BoxCLL newBox = head;
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
        BoxCLL headBox = head;
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

    public void setHead(BoxCLL newHead) {
        head = newHead;
    }
    public BoxCLL getHead() {
        return head;
    }

    public void setTail(BoxCLL newTail) {
        tail = newTail;
    }
    public BoxCLL getTail() {
        return tail;
    }
}
