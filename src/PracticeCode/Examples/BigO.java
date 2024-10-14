package PracticeCode.Examples;

public class BigO {
    //Big O - O()
    public static void main(String[] args) {
        //There is exactly 1 action here: the assignment of 6 to six.
        int size = 6;
        //So above is big O 1, or O(1).
        //This is considered to be the fastest thing you can do.

        //So, how many actions are here?
        int seven = 6;
        int eight = 6;
        int nine = 6;
        //This would technically be O(3), but we round down to O(1).
        //So, these actions are still all O(1).

        for(int i = 0; i < size; i++) { //We do "n" number of actions, and that's size here.
            int one = 6;
            int two = 6;
            int three = 6;
        }
        //Inside, we have 3 actions.
        //So, total, this might be O(3n), altogether.
            //We drop constants, though, so technically, the Big O here is just O(n).

        //If we were doing the work, it might look like: O(3n + 1).
            //1 represents the size creation that was done for the for loop.
        //But, the entire program here is still considered O(n).

        //What is the Big O here?
        for(int j = 0; j < size; j++) {
            for(int k = 0; k < size; k++) {
                System.out.println("12");
            }
        }
        //This would be O(n^2).
        //The more loops we have (within each other), the slower the program will be to run.
    }
}
