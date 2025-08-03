package LessonCore01.Task01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Post> posts = new ArrayList<>();
        posts.add(new Post(1, 1, "Hello everyone!", "hi!!"));
        posts.add(new Post(1, 2, "Good day to everyone", "Good day"));
        posts.add(new Post(1, 3, "meow meow meow meow", "meow"));
        posts.add(new Post(1, 4, "Hello EVERY-!!", "HEy!!"));
        posts.add(new Post(5));

        for (Post post : posts) {
            System.out.println(post);
        }
    }
}
