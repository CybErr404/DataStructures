package Implementations.DataStructures.ArrayList;

import java.util.Arrays;

public class TestMiaContainer {
    public static void main(String[] args) {
        MiaContainer miaContainer = new MiaContainer();

        System.out.println("Adding data to the Mia Container...");

        for(int i = 1; i <= 20; i++) {
            miaContainer.addData(i);
        }

        System.out.println("Here are the results of adding the numbers 1-20 to the container: ");
        System.out.println(miaContainer);

        System.out.println("\nAdding 22 to the container: ");
        miaContainer.addData(22);
        System.out.println(miaContainer);

        System.out.println("\nAdding 21 to the container in the second to last position: ");
        miaContainer.addData(20, 21);
        System.out.println(miaContainer);

        System.out.println("\nAdding 24 to the container in the last position: ");
        miaContainer.addData(22, 24);
        System.out.println(miaContainer);

        System.out.println("\nAdding 0 to the container in the first position: ");
        miaContainer.addData(0, 0);
        System.out.println(miaContainer);

        System.out.println("\nAdding -1 to the container in the first position using the addFirst() method: ");
        miaContainer.addFirst(-1);
        System.out.println(miaContainer);

        System.out.println("\nReplacing 24 with 23 using the replace() method: ");
        miaContainer.replace(24, 23);
        System.out.println(miaContainer);

        System.out.println("\nRemoving 6 using the regular remove() method: ");
        miaContainer.remove(7);
        System.out.println(miaContainer);

        System.out.println("\nRemoving -1 using the regular remove() method: ");
        miaContainer.remove(0);
        System.out.println(miaContainer);

        System.out.println("\nRemoving 23 using the regular remove() method: ");
        miaContainer.remove(22);
        System.out.println(miaContainer);

        System.out.println("\nRemoving 0 using the removeFirst() method: ");
        miaContainer.removeFirst();
        System.out.println(miaContainer);

        System.out.println("\nChecking the size of the container: ");
        System.out.println(miaContainer.checkSize());

        System.out.println("\nGetting the element in the fifth position: ");
        System.out.println(miaContainer.getElement(4));

        System.out.println("\nChecking if the container has the number 19 (true): ");
        System.out.println(miaContainer.contains(19));

        System.out.println("\nChecking if the container has the number 1000 (false): ");
        System.out.println(miaContainer.contains(1000));

        System.out.println("\nChecking the index of 2: ");
        System.out.println(miaContainer.indexOf(2));

        System.out.println("\nChecking whether the container is empty: ");
        System.out.println(miaContainer.isEmpty());

        System.out.println("\nAdding all 7s to the container using the addAll() method: ");
        miaContainer.addAll(7);
        System.out.println(miaContainer);

        System.out.println("\nClearing the container: ");
        System.out.println(Arrays.toString(miaContainer.clearContainer()));
    }
}
