package LessonCore04.Task04;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Person implements Comparable<Person> {
    int id;
    String name;

    @Override
    public int compareTo(Person p) {
        return this.getId() - p.getId();
    }
}
