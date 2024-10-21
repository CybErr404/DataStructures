import java.util.Stack;

public class PalindromeChecker {
    private Stack<String> stack;

    public PalindromeChecker() {
        stack = new Stack<>();
    }

    //CONVERTS ANYTHING EVER TO A STRING: + ""
    public boolean isPalindrome1(String word) {
        String item = "";
        for(int i = 0; i < word.length(); i++) {
            stack.push(String.valueOf(word.charAt(i)));
        }
        for(int i = 0; i < word.length(); i++) {
            item = item + stack.pop();
        }
        return item.equals(word);
    }

    public boolean isPalindrome2(String word) {
        stack.removeAllElements();
        Stack<String> halfStack = new Stack<>();
        int halfValue = word.length() / 2;
        for(int i = 0; i < word.length(); i++) {
            stack.push(String.valueOf(word.charAt(i)));
        }
        if(halfValue % 2 == 0) {
            for(int i = 0; i < halfValue; i++) {
                halfStack.push(stack.pop());
            }
        }
        else {
            for(int i = 0; i < halfValue + 1; i++) {
                halfStack.push(stack.pop());
            }
            halfStack.pop();
        }
        return halfStack.equals(stack);
    }
}
