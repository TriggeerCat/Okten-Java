package LessonCore05.Task03;

import java.util.List;

public class CSTransformer {
    public static String transform(String course, List<String> students) {
        List<String> temp = new java.util.ArrayList<>(List.of(course.split(" ")));
        String transformed = temp.removeFirst() + ' ' + temp.removeFirst() + ' ';

        while (!temp.isEmpty()) {
            transformed += "(" + students.get(Integer.parseInt(temp.removeFirst()) - 1) + ")";
            if (!temp.isEmpty()) transformed += ' ';
        }

        return transformed;
    }
}
