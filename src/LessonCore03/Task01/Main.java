package LessonCore03.Task01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Printable> printables = new ArrayList<>();
        printables.add(new Book());
        printables.add(new Magazine());
        printables.add(new Magazine());
        printables.add(new Book());
        printables.add(new Book());
        printables.add(new Magazine());

        Printable magazine = printables.get(2);

        magazine.print();
    }
}
