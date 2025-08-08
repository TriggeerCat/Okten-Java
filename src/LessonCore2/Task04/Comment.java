package LessonCore2.Task04;

import lombok.*;

@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Comment {
    @NonNull
    private int postId;
    @NonNull
    private int id;
    private String name;
    private String email;
    private String body;
}
