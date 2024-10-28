package QuickDrills.StackReverser;

import java.util.Stack;

public class StackReverser {
    private Stack<String> stack;

    public StackReverser() {
        stack = new Stack<>();
    }

    public void reverse(String word) {
        String result = "";
        for(int i = 0; i < word.length(); i++) {
            stack.push(String.valueOf(word.charAt(i)));
        }
        for(int i = 0; i < word.length(); i++) {
            result = result + stack.pop();
        }
        System.out.println("Original word: " + word + "\n" + "Reversed word: " + result);
    }
}
