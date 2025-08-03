package LessonCore01.Task02;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Comment> comments = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            comments.add(new Comment(i));
        }

        for (Comment comment : comments) {
            System.out.println(comment);
        }
    }
}
