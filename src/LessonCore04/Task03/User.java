package LessonCore04.Task03;

import lombok.*;

import java.util.ArrayList;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class User implements Comparable<User> {
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Gender gender;
    private ArrayList<Skill> skills;
    private Car car;

    @Override
    public int compareTo(User o) {
        return this.id - o.id;
    }
}
