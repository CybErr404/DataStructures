package QuickDrills.PalindromeChecker;

public class TestPalindromeChecker {
    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker();
        System.out.println("'hello' is a palindrome: " + checker.isPalindrome2("hello"));
        System.out.println("'racecar' is a palindrome: " + checker.isPalindrome2("racecar"));
        System.out.println("'ada' is a palindrome: " + checker.isPalindrome2("ada"));
    }
}
