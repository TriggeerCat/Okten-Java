package LessonCore02.Task04;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Post> posts = new ArrayList<>();
        ArrayList<Comment> comments = new ArrayList<>();

        posts.add(new Post(1, 1, "sunt aut facere repellat provident occaecati excepturi optio reprehenderit", "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"));
        posts.add(new Post(1, 2, "qui est esse", "est rerum tempore vitae\nsequi sint nihil reprehenderit dolor beatae ea dolores neque\nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis\nqui aperiam non debitis possimus qui neque nisi nulla"));
        posts.add(new Post(1, 3, "ea molestias quasi exercitationem repellat qui ipsa sit aut", "et iusto sed quo iure\nvoluptatem occaecati omnis eligendi aut ad\nvoluptatem doloribus vel accusantium quis pariatur\nmolestiae porro eius odio et labore et velit aut"));

        comments.add(new Comment(1, 1, "id labore ex et quam laborum", "Eliseo@gardner.biz", "laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium"));
        comments.add(new Comment(1, 2, "quo vero reiciendis velit similique earum", "Jayne_Kuhic@sydney.com", "est natus enim nihil est dolore omnis voluptatem numquam\net omnis occaecati quod ullam at\nvoluptatem error expedita pariatur\nnihil sint nostrum voluptatem reiciendis et"));
        comments.add(new Comment(2, 3, "odio adipisci rerum aut animi", "Nikita@garfield.biz", "quia molestiae reprehenderit quasi aspernatur\naut expedita occaecati aliquam eveniet laudantium\nomnis quibusdam delectus saepe quia accusamus maiores nam est\ncum et ducimus et vero voluptates excepturi deleniti ratione"));
        comments.add(new Comment(2, 4, "alias odio sit", "Lew@alysha.tv", "non et atque\noccaecati deserunt quas accusantium unde odit nobis qui voluptatem\nquia voluptas consequuntur itaque dolor\net qui rerum deleniti ut occaecati"));
        comments.add(new Comment(3, 5, "vero eaque aliquid doloribus et culpa", "Hayden@althea.biz", "harum non quasi et ratione\ntempore iure ex voluptates in ratione\nharum architecto fugit inventore cupiditate\nvoluptates magni quo et"));

        System.out.println("-----");
        for (Post post : posts) {
            System.out.println(post);
            System.out.println("-----");
            for (Comment comment : comments) {
                if (comment.getPostId() == post.getId()) {
                    System.out.println(comment);
                    System.out.println("-----");
                }
            }
            System.out.println("-----");
        }
    }
}
