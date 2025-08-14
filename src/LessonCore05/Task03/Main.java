package LessonCore05.Task03;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Path coursesPath = Paths.get("src", "LessonCore05", "Task03", "courses.txt");
        Path studentsPath = Paths.get("src", "LessonCore05", "Task03", "students.txt");
        Path allInPath = Paths.get("src", "LessonCore05", "Task03", "coursesWithStudents.txt");

        List<String> courses = Files.readAllLines(coursesPath);
        List<String> students = Files.readAllLines(studentsPath);
        List<String> allIn = new ArrayList<>();

        courses.forEach(course -> allIn.add(CSTransformer.transform(course, students)));

        System.out.println(allIn);

        Files.write(allInPath, allIn);
    }
}

//– Cтворіть текстовий файл з іменами учнів та ід, створити файл з назвами курсу, ід курсу, та ід учнів,
//які навчаються на цьому курсі. Зчитати обидва файли, об’єднати між собою об’єкти з цих файлів, вивести в консоль
//та записати в новий файл