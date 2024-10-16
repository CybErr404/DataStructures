package DataStructureImplementations.LinkedList.SingularlyLinkedList;

//REPRESENTS THE INTRODUCTORY SINGULARLY LINKED LIST DATA STRUCTURE.
public class MiaDaisyChainConnectorSLL {
    private BoxSLL head;
    private int size;

    public MiaDaisyChainConnectorSLL() {
        head = null;
        size = 0;
    }

    public void addFront(int newData) {
        if(head == null) {
            head = new BoxSLL(null, newData);
        }
        else {
            BoxSLL temp = head;
            head = new BoxSLL(temp, newData);
        }
        size++;
    }

    public void addEnd(int newData) {
        BoxSLL newBox = new BoxSLL(null, newData);
        BoxSLL temp = get(size - 1);
        temp.setNext(newBox);
        size++;
    }

    public void addAtIndex(int position, int newData) {
        BoxSLL currentBox = get(position);
        BoxSLL temp1 = get(position - 1);
        BoxSLL temp2 = currentBox.getNext();
        BoxSLL newBox = new BoxSLL(null, newData);
        temp1.setNext(newBox);
        newBox.setNext(currentBox);
        currentBox.setNext(temp2);
        size++;
    }

    public void removeFront() {
        head = head.getNext();
        size--;
    }

    public void removeEnd() {
        BoxSLL temp = get(size - 1);
        temp.setNext(null);
        size--;
    }

    public void removeAtIndex(int position) {
        BoxSLL currentBox = get(position);
        BoxSLL temp1 = get(position - 1);
        BoxSLL temp2 = currentBox.getNext();
        temp1.setNext(temp2);
        currentBox.setNext(null);
        size--;
    }

    public void replace(int position, int newData) {
        BoxSLL newBox = get(position);
        newBox.setData(newData);
    }

    public void clear() {
        head = null;
    }

    public BoxSLL get(int position) {
        BoxSLL newBox = head;
        for(int i = 0; i < position && newBox != null; i++) {
            newBox = newBox.getNext();
        }
        return newBox;
    }

    public boolean contains(int data) {
        BoxSLL newBox = head;
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
        BoxSLL headBox = head;
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
