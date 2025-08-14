package LessonCore05.Task02;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Student {
    String name;
    int age;
    int academicYear;

    @Override
    public String toString() {
        return name + ' ' + age + ' ' + academicYear;
    }
}
