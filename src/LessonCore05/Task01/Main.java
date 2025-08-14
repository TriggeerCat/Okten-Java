package LessonCore05.Task01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        Path textPath = Paths.get("src", "LessonCore05", "Task01", "text.txt");

        Files.readAllLines(textPath).forEach(System.out::println);
    }
}