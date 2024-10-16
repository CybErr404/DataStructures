package OptionalHomework.OptionalHomework1;

import java.util.ArrayList;

public class TestBook {
    public static void main(String[] args) {
        Book mysteriousBenedictSociety = new Book();

        ArrayList<String> authorList = new ArrayList<>();
        authorList.add("Louise Candlish");
        int[] importantPages = new int[] {1, 2, 3, 4, 5};

        Book ourHouse = new Book("Our House", 342, authorList, importantPages);

        mysteriousBenedictSociety.greaterThanFive();
        mysteriousBenedictSociety.titlePrinter();
        ourHouse.printAll(authorList, importantPages);
    }
}
