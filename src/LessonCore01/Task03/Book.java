package LessonCore01.Task03;

import java.util.ArrayList;

public class Book {
    private int id;
    private int pageCount;
    private ArrayList<String> authors;
    private String title;


    public Book() {
    }

    public Book(int id, int pageCount, ArrayList<String> authors, String title) {
        this.id = id;
        this.pageCount = pageCount;
        this.authors = authors;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", pageCount=" + pageCount +
                ", authors=" + authors +
                ", title='" + title + '\'' +
                '}';
    }


    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public ArrayList<String> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<String> authors) {
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
