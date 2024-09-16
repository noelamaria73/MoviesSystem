package movie;

public class movieItem {
    private String title;
    private String author;

    public movieItem(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    void printDetails() {
        System.out.println("Title: " + this.title + ", Author: " + this.author);
    }
}
