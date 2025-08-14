package LessonCore05.Task02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> studentsOriginal = new ArrayList<>(Arrays.asList(
                new Student("Alice", 19, 1),
                new Student("Bob", 20, 2),
                new Student("Charlie", 21, 3),
                new Student("Diana", 22, 4),
                new Student("Ethan", 18, 1),
                new Student("Fiona", 19, 2),
                new Student("George", 20, 3),
                new Student("Hannah", 21, 4),
                new Student("Ian", 18, 1),
                new Student("Jasmine", 22, 3)
        ));

        Path studentsFilePath = Paths.get("src", "LessonCore05", "Task02", "students.txt");
        List<String> studentsString = new ArrayList<>();
        studentsOriginal.forEach(student -> studentsString.add(student.toString()));

        Files.write(studentsFilePath, studentsString);

        List<String> studentsStringNew = Files.readAllLines(studentsFilePath);
        studentsStringNew.sort(Comparator.comparingInt(student -> Integer.parseInt(student.split(" ")[1])));
        System.out.println(studentsStringNew);
    }
}