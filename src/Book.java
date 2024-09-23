import java.util.ArrayList;

public class Book {
    private String title;
    private int pages;

    private ArrayList<String> authors;
    private int[] importantPages;

    public Book() {
        title = "The Mysterious Benedict Society";
        pages = 512;
        authors = new ArrayList<>();
        importantPages = new int[5];
    }

    public Book(String userTitle, int userPages, ArrayList<String> userAuthors, int[] userImportantPages) {
        title = userTitle;
        pages = userPages;
    }

    public void setTitle(String newTitle) {
        title = newTitle;
    }
    public String getTitle() {
        return title;
    }

    public void setPages(int newPages) {
        pages = newPages;
    }
    public int getPages() {
        return pages;
    }

    public String greaterThanFive() {
        if (this.getPages() > 5) {
            return "The number of pages in the book is greater than five.";
        }
        else return "The number of pages in the book is not greater than five.";
    }

    public void titlePrinter() {
        for(int i = 0; i < 100; i++) {
            while(i % 2 != 0) {
                System.out.println(this.getTitle());
                i = i * 2;
            }
        }
    }

    public void printAll(ArrayList<String> authors, int[] importantPages) {
        for(String author : authors) {
            System.out.println(author);
        }

        int i = 0;
        while(i < importantPages.length) {
            System.out.print(importantPages[i]);
            i++;
        }
    }
}
