import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedListTest = new LinkedList<>();

        linkedListTest.add("Hello");
        linkedListTest.add("World");

        System.out.println(linkedListTest);

        //DOUBLY LINKED LIST.
        //We can do double linked lists by simply updating our Box to contain a previous, prev,
        //before, or whatever makes sense.

        //We can also update our Daisy Chain Connector (Linked List implementation)
        //to have a global variable tail AND head.
            //Tail - last box.
            //Head - first box.

        //CIRCULARLY LINKED LIST.
        //When we reach the end, the tail can connect to head. This creates a circularly linked list.
        //When we reach the end, it goes to the head, and if we reach the head, it can go to the tail.
        //CONTINUOUS LIST!

        //We can check the API for all the methods included within the linked list Java classes.
        //LinkedLists are similar to ArrayLists. LinkedLists are just linked!

        //HOMEWORK -
        //Finish LinkedList implementation (Daisy Chain Connector program).
            //Our Daisy Chain is the same as LinkedLists and Boxes are the same as nodes.
        //Then, implement Doubly and Circularly LinkedLists.
            //Once you have the initial implementation, this should be SHORT code wise.
        //OPTIONAL -
        //Wire it to be GENERIC.
        //ADVICE -
        //Be very careful what you find on the internet.
    }
}
