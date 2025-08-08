package LessonCore2.Task04;

import lombok.*;

@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Post {
    private int userId;
    @NonNull
    private int id;
    private String title;
    private String body;
}
