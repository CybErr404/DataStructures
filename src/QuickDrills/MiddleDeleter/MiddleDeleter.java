package QuickDrills.MiddleDeleter;

import java.util.Stack;

public class MiddleDeleter {
    private Stack<String> stack;
    private Stack<String> newStack;

    public MiddleDeleter() {
        stack = new Stack<>();
        newStack = new Stack<>();
    }

    public String deleteMiddleCharacter(String word) {
        stack.removeAllElements();
        newStack.removeAllElements();
        int halfValue = word.length() / 2;
        if(halfValue % 2 != 0) {
            halfValue++;
        }
        for(int i = 0; i < word.length(); i++) {
            stack.push(String.valueOf(word.charAt(i)));
        }
        if(word.length() % 2 == 0) {
            for(int i = 0; i < halfValue - 1; i++) {
                newStack.push(stack.pop());
            }
            stack.pop();
            stack.pop();
            for(int i = 0; i < stack.size(); i++) {
                newStack.push(stack.pop());
            }
        }
        //hello
        //word length = 5
        //halfValue 5 / 2 = 2
        //halfValue needs to be 1 more IF word length is odd to properly get the middle value
        //check if word is odd AND the halfValue mod check results in 0
        else {
            for(int i = 0; i <= halfValue; i++) {
                newStack.push(stack.pop());
            }
            newStack.pop();
            for(int i = 0; i < stack.size(); i++) {
                newStack.push(stack.pop());
            }
        }
        return "Original: " + word + "\nStack with middle character deleted: " + newStack;
    }
}
