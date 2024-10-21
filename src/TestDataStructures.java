import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class TestDataStructures {
    //Using a tester class and main method only:
    //Make an ArrayList and put 4 elements in it, remove 1, print results.
    //Make a LinkedList, repeat.
    //Make a Stack, repeat.

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < 4; i++) {
            arrayList.add(i);
            linkedList.add(i);
            stack.push(i);
        }

        System.out.println("Testing Data Structures!");
        System.out.println("ArrayList, LinkedList, and Stack after adding 4 elements to each:");
        System.out.println(arrayList);
        System.out.println(linkedList);
        System.out.println(stack + "\n");

        arrayList.remove(0);
        linkedList.remove(0);
        stack.pop();

        System.out.println("ArrayList, LinkedList, and Stack after removing one element from each:");
        System.out.println(arrayList);
        System.out.println(linkedList);
        System.out.println(stack);
    }
}
